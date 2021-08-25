package comp.set.linkedHashSetDemo;

public class Student {
		int id;
		String name;
		float percentage;
			
		public Student(int id, String name, float percentage) {
			super();
			this.id = id;
			this.name = name;
			this.percentage = percentage;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
		}
		
		
}
