//find common elements In 3 sorted arrays

import java.util.*;

class GFG2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int n3 = sc.nextInt();

            int A[] = new int[n1];
            int B[] = new int[n2];
            int C[] = new int[n3];

            for (int i = 0;i < n1;i++)
            {
                A[i] = sc.nextInt();
            }
            for (int i = 0;i < n2;i++)
            {
                B[i] = sc.nextInt();
            }
            for (int i = 0;i < n3;i++)
            {
                C[i] = sc.nextInt();
            }

            Solution1 sol = new Solution1();
            ArrayList<Integer> res = sol.commonElements(A, B, C, n1, n2, n3);
            if (res.size() == 0)
            {
                System.out.print(-1);
            }
            else
            {
                for (int i = 0;i < res.size();i++)
                {
                    System.out.print(res.get(i) + " ");
                }
            }
            System.out.println();
        }
    }
}

class Solution1
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3)
    {
        int x=0, y=0, z=0;

        ArrayList<Integer> al = new ArrayList<>();
        while(x < n1 && y < n2 && z < n3) {
            if(A[x] == B[y] && B[y] == C[z]) {
                al.add(A[x]);

                int ele = A[x];

                while(x < n1 && A[x] == ele)
                    x++;
                while(y < n2 && B[y] == ele)
                    y++;
                while(z < n3 && C[z] == ele)
                    z++;
            }

            else if(A[x] < B[y]) {
                x++;
            }

            else if(B[y] < C[z]) {
                y++;
            }

            else {
                z++;
            }
        }
        return al;
    }
}
