package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClass {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Java","Python","Angular","Jira");
	    Stream<String> mystream = list.stream();
	    
	    String[] arr = {"Java","Python","Angular","Jira"};
	    Stream<String> myStream = Arrays.stream(arr);
	    
        Stream<Integer> intStream = Stream.of(-1,-3,43,0,1,3,5,-9,1,2,3,4,5,6,7);
        //List<Integer> l = intStream.filter(n -> n%2==0).collect(Collectors.toList());
	    //System.out.println(l);
	    List<Integer> l2 = intStream
	    		.filter(n -> n>0)
	    		.map(n ->n+50)
	    		.distinct()
	    		.sorted((a,b)->(b-a))
	    		.collect(Collectors.toList());
	    System.out.println(l2);
	}

}
