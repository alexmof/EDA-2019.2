

public class main {

	public static void main(String[] args) {
		LinkedList lista1 = new LinkedList();
		LinkedList lista2 = new LinkedList();
		LinkedList lista3 = new LinkedList();
		
		lista1.addLast(3);
		lista1.addLast(2);
		lista1.addLast(1);

		lista3.addLast(3);
		
		//___________ISEMPTY________
		/*
		System.out.println(lista1.isEmpty());
		System.out.println(lista2.isEmpty());
		*/
		
		//___________SIZE__________
		/*
		System.out.println(lista1.size());
		System.out.println(lista2.size());
		*/
		
		//___________INSERT__________-
		/*lista1.addLast(5);
		lista1.addLast(7);
		System.out.println(lista1.isSorted());
		System.out.println(lista1.size());
		System.out.println(lista1.soma());
		*/
		
		/*System.out.println(lista2.isSorted());
		System.out.println(lista2.soma());
		lista2.addLast(4);
		lista2.addLast(7);
		System.out.println(lista2.size());
		System.out.println(lista2.isSorted());
		System.out.println(lista2.soma());
		*/
		
		
		System.out.println(lista3.size());
		System.out.println(lista3.isSorted());
		lista3.addLast(1);
		lista3.add(1, 2);
		System.out.println(lista3.soma());
		System.out.println(lista3.isSorted());
		
		//_____________REMOVE______________
		System.out.println(lista1.size());
		lista1.remove(0);
		System.out.println(lista1.size());
		
	}
}
