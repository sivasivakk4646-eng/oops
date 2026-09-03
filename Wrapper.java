public class Wrapper
{
public static void main(String args[])
{
int primitiveInt=100;
float primitiveFloat=25.75f;
char primitiveChar='A';
boolean primitiveBoolean=true;
Integer WrappedInt=primitiveInt;
Float WrappedFloat=primitiveFloat;
Character WrappedChar=primitiveChar;
Boolean WrappedBoolean=primitiveBoolean;
System.out.println("Autoboxed Integer:"+WrappedInt);
System.out.println("Autoboxed Float:"+WrappedFloat);
System.out.println("Autoboxed Character:"+WrappedChar);
System.out.println("Autoboxed Boolean:"+WrappedBoolean);
int unboxedInt=WrappedInt;
float unboxedFloat=WrappedFloat;
char unboxedChar=WrappedChar;
boolean unboxedBoolean=WrappedBoolean;
System.out.println("Unboxed int:"+unboxedInt);
System.out.println("Unboxed float:"+unboxedFloat);
System.out.println("Unboxed char:"+unboxedChar);
System.out.println("Unboxed Boolean:"+unboxedBoolean);
String intString="360";
Integer parsedInt = Integer.parseInt(intString);
String floatString="75.25";
Float parsedFloat=Float.parseFloat(floatString);
String charString="c";
Character parsedChar=charString.charAt(0);
String booleanString="true";
Boolean parsedBoolean=Boolean.parseBoolean(booleanString);
System.out.println("Parsed and autoboxed Integer:"+parsedInt);
System.out.println("Parsed and autoboxed Float:"+parsedFloat);
System.out.println("Parsed and autoboxed Float:"+parsedChar);
System.out.println("Parsed and autoboxed Boolean:"+parsedBoolean);
}
}
