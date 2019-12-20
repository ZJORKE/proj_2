package hanshujiekou.com;
@FunctionalInterface
interface Printable{
void print(StringUtils su, String text);
}
class StringUtils{
	public void printUpperCase(String str){
		System.out.println(str.toUpperCase());
	}
}
public class E27 {
public static void main(String[] args) {
	printUpper(new StringUtils(),"Hellow",(object,t)->object.printUpperCase(t));
	printUpper(new StringUtils(),"Hellow",StringUtils::printUpperCase);
}
private static void printUpper(StringUtils su, String text, Printable pt) {
	((Printable) pt).print(su,text);
	
}
}
