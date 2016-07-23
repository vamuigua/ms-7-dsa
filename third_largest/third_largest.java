// Using the Java language, have the function ThirdGreatest(strArr)
// take the array of strings stored in strArr and return the third largest word within in.
// So for example: if strArr is ["hello", "world", "before", "all"]
// your output should be "world" because "before" is 6 letters long, and "hello" and "world" are both 5, but the output should be world because it appeared as the last 5 letter word in the array. If strArr was ["hello", "world", "after", "all"] the output should be after because the first three words are all 5 letters long, so return the last one. The array will have at least three strings and each string will only contain letters.

// use the main method only for calling the function where your logic lies. :-)
**java
public String ThirdGreatest(String []strArr){
String result="";
String sortedstring="";

boolean cons=true;
while(cons){
for (int=i;i<strArrr.length-1,i++){
if (strArr [i].length()<strArr[i-1].length()){
sortstring=strArr[i];
strArr[i]=strArr[i+1];
strArr[i+i]=sortedstring;
cons=false;

}
}
}

return strArr[2];
}
public static void main(String[] args) { 
String []test={"hello", "world", "before", "all"};
system.out.println(ThirdGreatest(test))
}
