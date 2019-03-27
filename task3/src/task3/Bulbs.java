package task3;
import java.util.*;
public class Bulbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        long k;
        int p[]=new int[]{1,2,3,5,7,11,13,17,19,23,29,31,37};
        String s;
        
        for(int i=0;i<t;i++)
        {
            s=sc.next();
            k=sc.nextLong();
            TreeSet<Long>r = new TreeSet<Long>();
            for(int d:p)
            {
                    if(s.charAt(d-1)=='1')
                    {
                        for(long j=1;j<=k;j++)
                        {
                            r.add((d)*j);
                        }
                    }
            }
            Iterator<Long> it = r.iterator();
             int x = 0;
            Long current = null;
            while(it.hasNext() && x < k) {
            current = it.next();
            x++;
            }
            System.out.println(current);
        }
    
}
}


