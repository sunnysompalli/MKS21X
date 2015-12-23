public class BarCode implements Comparable{
    // instance variables
    private String _zip;
    private int _checkDigit;

    String[]code = {"||:::", ":::||", "::|:|", "::||:", ":|::|", ":|:|:", ":||::", "|:::|", "|::|:", "|:|::"};

    // constructors
    //precondtion: zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public BarCode(String zip) {
	if (zip.length() != 5){
	    throw new RuntimeException();
	}
	_zip = zip;
	int sum = 0;
	for (int i = 0; i < 5; i ++){
	    sum += Integer.parseInt(_zip.substring(i, i + 1));
	}
	_checkDigit = sum % 10;
    }

    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x){
	this._zip = x._zip;
	this._checkDigit = x._checkDigit;
    }


    //post: computes and returns the check sum for _zip
    private int checkSum(){
	int ans = 0;
	for (int i = 0; i < 5; i ++){
	    ans += Integer.parseInt(_zip.substring(i, i + 1));
	}
	return ans;
    }

    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	String barcode = "";
	for (int i = 0; i < 5; i++){
	    barcode += code[Integer.parseInt(_zip.substring(i, i + 1))];
	}
	barcode += code[_checkDigit];
	return _zip + _checkDigit + "  " + barcode;
    }


    public boolean equals(Object other){}
    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.


    public int compareTo(Comparable other){}
    // postcondition: compares the zip + checkdigit 

}
