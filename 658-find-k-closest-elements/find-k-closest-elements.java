class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> r = new ArrayList<>();
        int n = arr.length;
        if(x<arr[0]){
            for(int i=0; i<k; i++){
                r.add(arr[i]);
            }
            return r;
        }
        else if(x>arr[n-1]){
            for(int i=n-1; i>=k; i--){
                r.add(arr[i]);
            }
            Collections.sort(r);
            return r;
        }

        int lb = n;
        int lo = 0, hi = n-1;
        while(lo<=hi){
            int mid = lo +(hi-lo)/2;
            if(arr[mid]>=x){
                lb = Math.min(lb,mid);
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }

        int i = lb-1, j=lb;
        while(k>0 && i>=0 && j<=n-1){
            int disI = Math.abs(arr[i]-x);
            int disJ = Math.abs(arr[j]-x);
            if(disI<=disJ){
                r.add(arr[i]);
                i--;
            }
            else{
                r.add(arr[j]);
                j++;
            }
            k--;
        }

        while(k>0 && i<0){
            r.add(arr[j]);
            j++;
            k--;
        }

        while(k>0 && j>n-1){
            r.add(arr[i]);
            i--;
            k--;
        }

        Collections.sort(r);
        return r;
    }
}