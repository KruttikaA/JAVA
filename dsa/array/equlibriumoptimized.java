class EquilibriumIndexExample2  
{  
    static int eqbmindex(int array[], int n)  
    {  
        // lsum denotes the left sum and rsum denotes the right sum
        int prefix[] = new int[n];  
        
        // stores the sum of whole array
        for (int i = 0; i < n; i++)  
        {  
            if(i == 0)   
                prefix[i] = array[i];  
            else 
                prefix[i] = array[i] + prefix[i-1];  
        }  
        
        int rsum = prefix[n-1];  
        for(int i = 0 ; i < n; i++)  
        {  
            rsum = rsum - array[i];  
            int lsum = (i == 0) ? 0 : prefix[i-1];  // Adjust the left sum calculation
            
            if(lsum == rsum)  // Corrected the equality check
                return i;  // Return the current index as the equilibrium index
        }  
        return -1;  // If no equilibrium index found
    }  
    
    public static void main(String args[])  
    {  
        int array[] = {-7,1,5,2,-4,3,0};  
        int arraysize = array.length;  
        System.out.print("Equilibrium Index is: ");  
        System.out.println(eqbmindex(array, arraysize));  
    }  
}
