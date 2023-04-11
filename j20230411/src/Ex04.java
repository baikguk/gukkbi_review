import java.util.Scanner;

public class Ex04 {
    static Polynomial[] pl;
    static int n=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pl = new Polynomial[10];
        boolean loop = true;
        while (loop) {
            System.out.print("$ ");
            String cmd = sc.next();
            char name= sc.next().charAt(0);
            int n1;
            int n2;
            Polynomial found_pl;
            switch (cmd) {
                case "create":
                   pl[n] = new Polynomial();
                   pl[n].terms = new Term[10];
                   create_term(pl[n].terms);
                   pl[n].name = name;
                   n++;
                    break;
                case "add":
                    n1= sc.nextInt();
                    n2 = sc.nextInt();
                    found_pl = find_pl(name);
                    add_term(found_pl,n1,n2);
                    break;
                case "calc":
                    n1= sc.nextInt();
                    found_pl = find_pl(name);
                    System.out.println(calc(found_pl,n1));
                    break;
                case "print":
                    found_pl = find_pl(name);
                    print(found_pl);
                    break ;
                case "exit":
                    sc.close();
                    loop = false;
                    System.exit(0);
                    break;
            }
        }
    }

    private static void print(Polynomial found_pl) {
        int count = found_pl.terms.length;
        for (int i = found_pl.terms.length - 1; i >=0; i--) {
            if (found_pl.terms[i].expo >1) {
                System.out.printf("%dX^%d ", found_pl.terms[i].coef, found_pl.terms[i].expo);
                System.out.print(count>1?"+":" ");
            } else if (found_pl.terms[i].expo == 1) {
                System.out.printf("%dX ", found_pl.terms[i].coef);
                System.out.print(count>1?"+":" ");
            } else if (found_pl.terms[i].coef != 0&&found_pl.terms[i].expo == 0) {
                System.out.printf("%d ", found_pl.terms[i].coef);
                System.out.print(count>1?"+":" ");
            }
            count--;
        }
        System.out.println();
    }

    private static void create_term(Term[] terms) {
        for(int i =0;i<terms.length;i++){
            terms[i] =new Term();
        }
    }

    private static int calc(Polynomial found_pl, int n1) {
        int sum=0;
        for (int i = 0; i < found_pl.terms.length; i++) {
            sum += found_pl.terms[i].coef*Math.pow(n1,i);
        }
        return sum;
    }

    private static void add_term(Polynomial found_pl,int n1, int n2) {
        if (found_pl.terms[n2].expo == 0) {
            found_pl.terms[n2].expo = n2;
            found_pl.terms[n2].coef = n1;
        }else {
            found_pl.terms[n2].coef +=n1;
        }


    }

    private static Polynomial find_pl(char name) {
        int i =0;
        for (i = 0; i < pl.length; i++) {
            if (pl[i].name == name) {
               return pl[i];
            }else {
                System.out.println("해당 하는 다항식이 없습니다");
            }
        }
        return pl[i];
    }
}
