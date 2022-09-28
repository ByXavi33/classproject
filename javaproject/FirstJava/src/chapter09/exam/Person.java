package chapter09.exam;

public class Person extends Object{
		
	 String personNumber;
	 
	 Person(String personNumber) {
		this.personNumber = personNumber;
	}
		
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if (obj != null && obj  instanceof Person) {
			Person person = (Person) obj;
			result = this.personNumber.equals(person.personNumber);
	}
		return result;
	}

	@Override
	public String toString() {
		return "Person [personNumber=" + personNumber + "]";
	}
	public static void main(String[] args) {
		Person person1 = new Person("970609-1100000");
		Person person2 = new Person("970609-1100000");
		
		System.out.println(person1);
		System.out.println(person2);

		if(person1.equals(person2)) {
			System.out.println("같은 주민번호입니다");
		}	else { 
				System.out.println("다른 주민번호입니다");
			}
			
		}
	
	}
	
	
	 
	

