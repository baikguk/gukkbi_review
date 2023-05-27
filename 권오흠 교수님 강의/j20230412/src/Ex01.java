import java.util.Scanner;

public class Ex01 {
    static Polynomial[] pl  =new Polynomial[10];;
    static int n=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("$ ");
            String cmd = sc.next();
            char name= sc.next().charAt(0);
            int n1;
            int n2;
            int found_pl_index;
            if(cmd.equals("create")){
                pl[n] = new Polynomial();
                pl[n].terms = new Term[10];
                pl[n].name = name;
                n++;
            }else if(cmd.equals("add")) {
                n1 = sc.nextInt();
                n2 = sc.nextInt();
                found_pl_index = find_pl(name);
                add_term(found_pl_index, n1, n2);
            } else if (cmd.equals("calc")) {
                n1= sc.nextInt();
                found_pl_index = find_pl(name);
                System.out.println(calc(pl[found_pl_index],n1));

            } else if (cmd.equals("print")) {
                found_pl_index = find_pl(name);
                print(pl[found_pl_index].terms);

            } else if (cmd.equals("exit")) {
                break;

            }else
                System.out.println("잘못입력");
        }
        sc.close();
        System.exit(0);
    }

    private static void print(Term[] terms) {
        for (int i = terms.length - 1; i >=0; i--) {
            if (terms[i].expo >1) {
                System.out.printf("%dX^%d ", terms[i].coef, terms[i].expo);
                System.out.print(i>1?"+":" ");
            } else if (terms[i].expo == 1) {
                System.out.printf("%dX ", terms[i].coef);
                System.out.print(i>1?"+":" ");
            } else if (terms[i].coef != 0&&terms[i].expo == 0) {
                System.out.printf("%d ", terms[i].coef);
                System.out.print(i>1?"+":" ");
            }
        }
        System.out.println();
    }

    private static int calc(Polynomial pl, int n1) {
        int sum=0;
        for (int i = 0; i < pl.nTerms; i++) {
            sum += pl.terms[i].coef*Math.pow(n1,pl.terms[i].expo);
        }
        return sum;
    }

    private static void add_term(int found_pl_index, int n1, int n2) {
        pl[found_pl_index].nTerms++;
        for(int i =0; i<pl[found_pl_index].nTerms;i++) {
            if (pl[found_pl_index].terms[i] == null) {
                pl[found_pl_index].terms[i] = new Term();
                pl[found_pl_index].terms[i].expo = n2;
                pl[found_pl_index].terms[i].coef = n1;
            } else if(pl[found_pl_index].terms[i].expo==n2){
                pl[found_pl_index].terms[i].coef += n1;
            }
        }
    }

    private static int find_pl(char name) {
        int i =0;
        for (i = 0; i < pl.length; i++) {
            if (pl[i].name == name) {
                return i;
            }else {
                System.out.println("해당 하는 다항식이 없습니다");
                return -1;
            }
        }
        return 0;
    }
}
