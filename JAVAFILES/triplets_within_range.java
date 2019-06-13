public class triplets_within_range
 {
    public int solve(ArrayList<String> array) 
    {
        if(array.size() < 3) 
            return 0;

        double a = Double.parseDouble(array.get(0)); 
        double b = Double.parseDouble(array.get(1)); 
        double c = Double.parseDouble(array.get(2)); 

         
        for(int i = 3; i < array.size(); i++){
                
   if((a+b+c) > 1 && (a+b+c) < 2){
                return 1;
            }

	   
            double n = Double.parseDouble(array.get(i));
            
            
           if((a+b+c) >= 2){
                if(a > b && a > c){
                    a = n;
                } else if( b > c){
                    b = n;
                } else{
                    c = n;
                }
            } else{
                if(a < b && a < c){
                    a = n;
                } else if( b < c){
                    b = n;
                } else{
                    c = n;
                }
            }
        }
        
        if((a+b+c) > 1 && (a+b+c) < 2){
            return 1;
        }
       
        return 0;
    }
}


