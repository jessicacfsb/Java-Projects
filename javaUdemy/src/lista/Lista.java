package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
	public static void main(String[] args) {
		//a lista é do tipo: interface
		/*COMANDOS PARA LISTA
		 * size() -> tamanho da lista
		 * add(obj)  add(int, obj) -> Insere elementos na lista
		 * remove(obj)  remove(int)  removeIf(Predicate) -> remove elementos da lista
		 * indexOf(obj)  lastIndexOf(obj) -> encontra posição de elementos na lista
		 * List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList()); -> filtrar lista com base no predicado
		 * Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null) -> encontrar a primeira ocorrencia com base no predicado*/
	
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Kamila");
		list.add("José");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		
		list.remove("Anna");
		list.remove(1);
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		
		list.removeIf(x -> x.charAt(0) == 'J'); //remove por predicado
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		System.out.println("index of Bob: " + list.indexOf("Bob"));
		System.out.println("index of Marco: " + list.indexOf("Marco"));
		System.out.println("------------------------------");
		
		//filtrar apenas os elementos que começam com M
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("------------------------------");
		//Encontrar elemento que atende um certo predicado
		//ex primeiro elemento que começa com a letra a
		String name = list.stream().filter(x -> x.charAt(0) == 'K').findFirst().orElse(null);
		System.out.println(name);
		System.out.println("------------------------------");
		String nameM = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		System.out.println(nameM);
	}
}
