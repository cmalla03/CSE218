package p1;

public class Demo1 {

	public static void main(String[] args) {
		Name n1 = new Name("A", "B"); // new object; new address
		Name n2 = new Name("A", "B");// new object; new address
		Name n3 = n1; //copies address of n1; no new object made
		
		System.out.println(n1 == n3); //different objects with different address so false

		// == compares address not the content
		//.equals compares the content itself; ie not the address
		// need to modify .equals so it can compare other objects (name for example) correctly
		
		System.out.println(n1.equals(n2)); // generating hash code makes .equals work correctly ("Thats it?")
		// .equals compares address first 
		// .equals comes from a universal Object class implemented in java
		// if the memory address is the same you don't need to compare any fields or content.
		// an address holds 8 bytes (64-bit architecture)
		// to compare address' you have to compare all 64 bits 
		// address' are transformed into hexadecimal so its more concise 
		//hashing 64 bits -> 32 bits
		// 2 - 64 bit address' can be hashed to the same 1 - 32 bit address
		// if the 2 - 64- bit address' have the same hashed value there's no guarantee the 2 original address' are different
		// if the 2 - 64 bit address' have different hashed value there is without a doubt the 2 original address' are different
	}

}
