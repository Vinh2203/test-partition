import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.service.Partition;

import junit.framework.TestCase;

public class TestPartition extends TestCase {
	

	@Test
    public void testPartition() {
		ArrayList<Integer> list = new ArrayList<>();
		for(int cpt  = 0; cpt <= 7; cpt++) {
			list.add(cpt);
		}
		
		ArrayList<List<Integer>> listExpected = new ArrayList<>();
		listExpected.add(Arrays.asList(0));
		listExpected.add(Arrays.asList(1));
		listExpected.add(Arrays.asList(2));
		listExpected.add(Arrays.asList(3));
		listExpected.add(Arrays.asList(4));
		listExpected.add(Arrays.asList(5));
		listExpected.add(Arrays.asList(6));
		listExpected.add(Arrays.asList(7));
		
		
        Partition partition = new Partition(list,1);
        System.out.println(partition.divideList().toString());
        assertEquals(listExpected, partition.divideList());
       
    }
	
	@Test
    public void testPartition2() {
		ArrayList<Integer> list = new ArrayList<>();
		for(int cpt  = 0; cpt <= 7; cpt++) {
			list.add(cpt);
		}
		
		ArrayList<List<Integer>> listExpected = new ArrayList<>();
		listExpected.add(Arrays.asList(0,1));
		listExpected.add(Arrays.asList(2,3));
		listExpected.add(Arrays.asList(4,5));
		listExpected.add(Arrays.asList(6,7));
		
		
        Partition partition = new Partition(list,2);
        System.out.println(partition.divideList().toString());
        assertEquals(listExpected, partition.divideList());
       
    }
	
	@Test
    public void testPartition3() {
		ArrayList<Integer> list = new ArrayList<>();
		for(int cpt  = 0; cpt <= 7; cpt++) {
			list.add(cpt);
		}
		
		ArrayList<List<Integer>> listExpected = new ArrayList<>();
		listExpected.add(Arrays.asList(0,1,2));
		listExpected.add(Arrays.asList(3,4,5));
		listExpected.add(Arrays.asList(6,7));
		
		
        Partition partition = new Partition(list,3);
        System.out.println(partition.divideList().toString());
        assertEquals(listExpected, partition.divideList());
       
    }
	
	@Test
    public void testPartition4() {
		ArrayList<Integer> list = new ArrayList<>();
		for(int cpt  = 0; cpt <= 7; cpt++) {
			list.add(cpt);
		}
		
		ArrayList<List<Integer>> listExpected = new ArrayList<>();
		listExpected.add(Arrays.asList(0,1,2,3));
		listExpected.add(Arrays.asList(4,5,6,7));
		
		
        Partition partition = new Partition(list,4);
        System.out.println(partition.divideList().toString());
        assertEquals(listExpected, partition.divideList());
       
    }
	
	@Test
    public void testPartition5() {
		ArrayList<Integer> list = new ArrayList<>();
		for(int cpt  = 0; cpt <= 7; cpt++) {
			list.add(cpt);
		}
		
		ArrayList<List<Integer>> listExpected = new ArrayList<>();
		listExpected.add(Arrays.asList(0,1,2,3,4));
		listExpected.add(Arrays.asList(5,6,7));
		
		
        Partition partition = new Partition(list,5);
        System.out.println(partition.divideList().toString());
        assertEquals(listExpected, partition.divideList());
       
    }
	
	@Test
    public void testPartition6() {
		ArrayList<Integer> list = new ArrayList<>();
		for(int cpt  = 0; cpt <= 7; cpt++) {
			list.add(cpt);
		}
		
		ArrayList<List<Integer>> listExpected = new ArrayList<>();
		listExpected.add(Arrays.asList(0,1,2,3,4,5));
		listExpected.add(Arrays.asList(6,7));
		
		
        Partition partition = new Partition(list,6);
        System.out.println(partition.divideList().toString());
        assertEquals(listExpected, partition.divideList());
       
    }
	
	@Test
    public void testPartition7() {
		ArrayList<Integer> list = new ArrayList<>();
		for(int cpt  = 0; cpt <= 7; cpt++) {
			list.add(cpt);
		}
		
        Partition partition = new Partition(list,6);
        assertEquals(true, partition.isSumFromNumberInList(16));
       
    }


}
