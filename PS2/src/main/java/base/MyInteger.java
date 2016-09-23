package base;

public class MyInteger {
private int iValue;
public MyInteger( int value){
	this.iValue = value;
}
public int getiValue(){
	return this.iValue;
}
public void setiValue(int newValue){
	this.iValue = newValue;
}
public boolean isEven(){
	if ((getiValue())%2 == 0){
		return true;
	}
	else{
		return false;
	}	
}
public static boolean isEven(int value){
	MyInteger jawn = new MyInteger(value);
	return jawn.isEven();
}
public static boolean isEven(MyInteger value){
	return value.isEven();
	}

public boolean isOdd(){
	if ((getiValue())%2 == 0){
		return false;
	}
	else{
		return true;
	}
}
public static boolean isOdd(int value){
	MyInteger jawn = new MyInteger(value);
	return jawn.isOdd();
}
public boolean isOdd (MyInteger value){
	return value.isOdd();
}
public boolean isPrime(){
	int baseValue =2;
	boolean primeJawn = true;
	if (getiValue() == 1){
		primeJawn = false;
	}
	else if (getiValue() == 2){
		primeJawn = true;
	}
	else if (getiValue() <= 0){
		primeJawn = false;
	}
	else{
	while(baseValue < getiValue()){
		if ((getiValue()) % baseValue == 0){
			primeJawn = false;
			break;
		}
		else {
			baseValue++;
		}
	}
	}
	return primeJawn;
	}
public static boolean isPrime(int value){
	MyInteger jawn = new MyInteger(value);
	return jawn.isPrime();
	}
public static boolean isPrime (MyInteger value){
	return value.isPrime();
}

public boolean equals(int value){
	if (getiValue() == value){
		return true;
	}
	else{
		return false;
	}
}
public boolean equals (MyInteger value){
	return value.equals(value.getiValue());
}
}