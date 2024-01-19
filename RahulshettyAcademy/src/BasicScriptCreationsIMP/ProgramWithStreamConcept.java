package BasicScriptCreationsIMP;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgramWithStreamConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// directly we can enter object to stream
		// Stream.of("Adam","Abhi","Gouda","Adya","Rama").filter(s->s.startsWith("A")).sorted().map(s->s.toLowerCase()).forEach(output->System.out.println(output));
      
	/*	String [] arr = {"Adam","Abhi","Gouda","Adya","Rama"};
		//Using stream with converted arrays to list & then got specified output
       List<String> names = Arrays.asList(arr);
       names.stream().filter(S->S.length()==4).map(s->s.startsWith("A")).forEach(s->System.out.println(s));  */
		
		// get below array in sorted order
		int [] values = {2,3,4,4,3,2,6,8,8,5,9,7,9,1};
		List<Integer> avalues = Arrays.asList(2,3,4,4,3,2,6,8,8,5,9,7,9,1);
		// avalues.stream().sorted().forEach(output->System.out.println(output));
		
	   // to get the quinic no.of sorted array
		
		 avalues.stream().distinct().sorted().forEach(output->System.out.println(output));
       // how to convert stream again to list for the further operations to do
		 String [] arr = {"Adam","Abhi","Gouda","Adya","Rama"};
	       List<String> names = Arrays.asList(arr);
	List <String > actualNames = names.stream().filter(S->S.length()==4).collect(Collectors.toList());
	
	// limit is used to limit o/p from the stream, exmple : if you have 6 objects in the stream out of them need only 3 then u can go
   // for limit like limit(3) >> in the case you will get only 3 object in the o/p
		 // distinct is method is use to get distinct elements form stream
       
	}

}
