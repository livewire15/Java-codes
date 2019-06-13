int minimumSwaps(vector<int> arr) {
    
    int i,c=0,n=arr.size();
    for(i=0;i<n;i++)
    {
        if(arr[i]==(i+1))//since index starts from 0.
            continue;
        
        swap(arr[i],arr[arr[i]-1]);//if element is not at its actual position then swapping the ith element 
        //with the position on which it has to be.[Do on paper]
        c++;
        i--;
    }
    return c;
}

//coz 0th index pe element 1 hoga,1st pe 2,2nd pe 3... and so on. 