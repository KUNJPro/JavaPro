// Assignment Operators

public class Assignment {
    public static void main(String[] args) {
        
        int A = 10;
        A += 10;  // A = A + 10
        System.out.println(A);

        float B = 3.14f;
        B -= 3.14;  // B = B - 3.14
        System.out.println(B);

        int C = 89;
        C *= 89;  // C = C * 89
        System.out.println(C);

        float D = 9.8f;
        D /= 9.8;  // D = D / 9.8
        System.out.println(D);

        int E = 12;
        E %= 12;  // E = E % 12
        System.out.println(E);

        int F = 34;
        F &= 34;
        System.out.println(F);

        int G = 45;
        G ^= 45;
        System.out.println(G);

        int H = 1;
        H |= 1;
        System.out.println(H);

        int I = 30;
        I <<= 30;
        System.out.println(I);

        int J = 11;
        J >>= 11;
        System.out.println(J);

        int K = 007;
        K >>>= 007;
        System.out.println(K);
        
    }
}