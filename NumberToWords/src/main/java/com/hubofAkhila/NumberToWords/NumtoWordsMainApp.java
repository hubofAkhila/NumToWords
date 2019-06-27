package com.hubofAkhila.NumberToWords;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
* @author V000478
*
*/
public class NumtoWordsMainApp {

/**
* @param args
*/
public static void main(String[] args) {
int n =956945781;
NumtoWordsMainApp appObj = new NumtoWordsMainApp();
System.out.println(appObj.numberToWordsChcek(n));

}

String numberToWordsChcek(int n) {
String returnString = "";

BiFunction<Integer, String, String> numberFunction = (Integer numval, String result) -> {

String[] one = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
"Nineteen" };
String[] ten = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninty" };
String retVal = "";
try {

int number = numval.intValue();
if (number > 19) {
retVal = ten[number / 10] + one[number % 10];

} else {
retVal = one[number];
}

if (number > 0) {
retVal = retVal + result;
}

} catch (IndexOutOfBoundsException e) {
System.err.print("Exception Occured" + e);
}
return retVal;
};

if (n < 0) {
returnString = "Number is less than 0";
} else if (n == 0) {
returnString = "Zero";
} else {
returnString = numberFunction.apply((n / 100000000) % 10, "Billion ")
+ numberFunction.apply((n / 1000000) % 100, "million ")
+ numberFunction.apply(((n / 100000) % 10), "hundred ")
+ numberFunction.apply(((n / 1000) % 100), "thousand ")
+ numberFunction.apply((n / 100) % 10, "hundred ") + numberFunction.apply(n % 100, "");
}
return returnString;
}

}


