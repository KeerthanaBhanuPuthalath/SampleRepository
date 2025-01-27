package exampleMaven;

public class StringMethodsExample 
{

	public static void main(String[] args) 
	{
		String a = "Hello";
		System.out.println(a);
		String b = new String("World");
		System.out.println(b);
		char c[] = {'s','u','m','a','n','a'};
		String d = new String(c);
		System.out.println(d);
		//length method - used to find length of string
		int i = a.length();
		System.out.println(i);
		//charAt method - used to get characters from specified index of a string.
		char j = a.charAt(1);
		System.out.println(j);
		//concat - used to combine two string.
		System.out.println(a.concat(b));
		//contains - used to check whether a specific word is present in a string.
		String k = "My first program";
		System.out.println(k.contains("program"));
		System.out.println(k.contains("hello"));
		//compareTo - to compare two string.
		String m = "Exclamation";
		String n = "Hello";
		System.out.println(a.compareTo(n));
		//toUpperCase - convert string to upper case.
		String p = "project";
		System.out.println(p.toUpperCase());
		//toLowerCase - convert string to lower case.
		String q = "MY PROJECT";
		System.out.println(q.toLowerCase());
		//equals - check whether two strings are same. (case sensitive)
		String r = "java";
		String s = "java";
		String t = "Java";
		String u = "selenium";
		System.out.println(r.equals(s));
		System.out.println(r.equals(t));
		System.out.println(r.equals(u));
		//equalsIgnoreCase - check whether two strings are same. (not case sensitive
		System.out.println(r.equalsIgnoreCase(t));

	}

}
