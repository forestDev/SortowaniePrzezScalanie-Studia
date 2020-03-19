package forestDevPackage;


public class MyMergeSortAlgorithm {
    
    int N;
    double tab[][];
    double t[][];
    int index;

    public MyMergeSortAlgorithm(double[][] cars, int index){ 
        this.tab = cars;
        this.N = cars.length;
        this.index = index;
   
    }
    
        public int getN(){
            return N;
        }

        public double[][] getTab(){
            return tab;
        }



        private void merge(int start, int mid, int end) {
            int s,j,q;
            t = new double[N][N];
            for (s=start; s<=end; s++){
                t[s][0] = tab[s][0];
                t[s][1] = tab[s][1];
                t[s][2] = tab[s][2];
            }  
            s=start; j=mid+1; q=start;                 
                while (s <= mid && j<=end) {		  
                    if (t[s][index] < t[j][index]){
                    
                       
                         tab[q][0]=t[s][0];         
                         tab[q][1] = t[s][1];    
                         tab[q][2] = t[s][2];
                         q++;
                         s++;
                    }
                    else{
                         // przypisanie na koniec tablicy 
                        tab[q][0]=t[j][0];
                         tab[q][1] = t[j][1];
                         tab[q][2] = t[j][2];
                         q++;
                         j++;
                    }
                }
            while (s<=mid){
                tab[q][0]=t[s][0];
                tab[q][1] = t[s][1];
                tab[q][2] = t[s][2];
                q++;
                s++;
            } 	//gdy drugi zbior sie skonczyl
            }
    
    
    public void firstSort(int start, int end) {
        int mid;
        if (start<end) {
            mid=(start+end)/2;
            firstSort(start, mid);    
            firstSort(mid+1, end);   
            merge(start, mid, end);  
            }
        }

}
