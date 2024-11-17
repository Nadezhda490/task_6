public class Main {
    public static void main(String[] args) {

// 1.1. Написать все фигуры используя while
        System.out.println();
        System.out.println("____________________________________________");
        System.out.println("1.1. Написать все фигуры используя while");
        System.out.println("____________________________________________");
        System.out.println();

//        System.out.print("* * * * *");
//        System.out.print("* * * * *");
//        System.out.print("* * * * *");
//        System.out.print("* * * * *");
//        System.out.print("* * * * *");
//        System.out.print("* * * * *");
//        System.out.print("* * * * *");
//        System.out.print("* * * * *");

        {
            int i = 0;
            while (i < 8) {
                int j = 0;
                while (j < 5) {
                    j++;
                    System.out.print(" * ");
                }
                System.out.println();
                i++;
            }
            System.out.println();
        }



//        System.out.println(" * ");
//        System.out.println("  * ");
//        System.out.println("   * ");
//        System.out.println("    * ");
//        System.out.println("     * ");
//        System.out.println("      * ");
//        System.out.println("       * ");
//        System.out.println("        * ");

        {
            int i = 0;
            while (i > -8) {
                int j = 0;
                while (j >= i) {
                    System.out.print(" ");
                    j--;
                }
                System.out.println("*");
                i--;
            }
            System.out.println();
        }



//        System.out.println("        * ");
//        System.out.println("       * ");
//        System.out.println("      * ");
//        System.out.println("     * ");
//        System.out.println("    * ");
//        System.out.println("   * ");
//        System.out.println("  * ");
//        System.out.println(" * ");

        {
            int i = 8;
            while (i > 0) {
                int j = 0;
                while (j < i) {
                    j++;
                    System.out.print(" ");
                }
                System.out.println("*");
                i--;
            }
            System.out.println();
        }



//        System.out.print("*       \n");
//        System.out.print("**      \n");
//        System.out.print("***     \n");
//        System.out.print("****    \n");
//        System.out.print("*****   \n");
//        System.out.print("******  \n");
//        System.out.print("******* \n");

        {
            int i = 0;
            while (i < 7) {
                int j = 0;
                while (j < i + 1) {
                    j++;
                    System.out.print("*");
                }
                System.out.println();
                i++;
            }
            System.out.println();
        }



//        System.out.print("******* \n");
//        System.out.print("******  \n");
//        System.out.print("*****   \n");
//        System.out.print("****    \n");
//        System.out.print("***     \n");
//        System.out.print("**      \n");
//        System.out.print("*       \n");

        {
            int i = 7;
            while (i >= 1) {
                int j = 1;
                while (j <= i) {
                    j++;
                    System.out.print("*");
                }
                System.out.println("");
                j = 1;
                i--;
            }
            System.out.println();
        }



//        System.out.print("       *       \n");
//        System.out.print("      ***      \n");
//        System.out.print("     *****     \n");
//        System.out.print("    *******    \n");
//        System.out.print("   *********   \n");
//        System.out.print("  ***********  \n");
//        System.out.print(" ************* \n");
//        System.out.print("***************\n");

        {
            int i = 1;
            int j = 1;
            int v = 0;
            while (i <= 8) {
                while (j <= 8 - i) {
                    j++;
                    System.out.print(" ");
                }
                while (v < i + i - 1) {
                    v++;
                    System.out.print("*");
                }
                System.out.println();
                v = 0;
                j = 1;
                i++;
            }
        }



//        System.out.print("        *        \n");
//        System.out.print("       ***       \n");
//        System.out.print("      *****      \n");
//        System.out.print("     *******     \n");
//        System.out.print("    *********    \n");
//        System.out.print("   ***********   \n");
//        System.out.print("  *************  \n");
//        System.out.print(" *************** \n");
//        System.out.print("*****************\n");
//        System.out.print(" *************** \n");
//        System.out.print("  *************  \n");
//        System.out.print("   ***********   \n");
//        System.out.print("    *********    \n");
//        System.out.print("     *******     \n");
//        System.out.print("      *****      \n");
//        System.out.print("       ***       \n");
//        System.out.print("        *        \n");

        {
            int i = 0;
            int j = 9, c = 6;
            int m = 1;
            int s = 0;
            int t = 1;
            while (i <= 10) {
                while (s <= 10 - i) {
                    System.out.print(" ");
                    s++;
                }
                while (t <= i + i - 3) {
                    t++;
                    System.out.print("*");
                }
                System.out.println();
                t = 1;
                s = 0;
                i++;
            }
            while (j >= 0) {
                while (c <= 9 - j) {
                    System.out.print(" ");
                    c++;
                }
                while (m <= j + j + 1) {
                    System.out.print("*");
                    m++;
                }
                System.out.println();
                m = 1;
                c = 1;
                j--;
            }
            System.out.println();
        }



// 1.2.Написать все фигуры используя do while
        System.out.println("____________________________________________");
        System.out.println("1.2. Написать все фигуры используя do while");
        System.out.println("____________________________________________");
        System.out.println();

//        System.out.print("* * * * *");
//        System.out.print("* * * * *");
//        System.out.print("* * * * *");
//        System.out.print("* * * * *");
//        System.out.print("* * * * *");
//        System.out.print("* * * * *");
//        System.out.print("* * * * *");
//        System.out.print("* * * * *");

        {
            int x = 3;
            int y = x * x - 2;
            int c = 0;
            int k = 0;
            do {
                int j = 5;
                do {
                    System.out.print(" * ");
                } while (--j > k);
                System.out.println();
            } while (++c <= y);
            System.out.println();
        }



//        System.out.println(" * ");
//        System.out.println("  * ");
//        System.out.println("   * ");
//        System.out.println("    * ");
//        System.out.println("     * ");
//        System.out.println("      * ");
//        System.out.println("       * ");
//        System.out.println("        * ");

        {
            int x = 1;
            int y = x * x - 4;
            int c = 0;
            int v = 1;
            int k = 1;
            do {
                int j = 0;
                do {
                    System.out.print(" ");
                } while (++j < k);
                System.out.println("*");
                k = k + v;
            } while (++c <= 4 - y);
            System.out.println();
        }



//        System.out.println("        * ");
//        System.out.println("       * ");
//        System.out.println("      * ");
//        System.out.println("     * ");
//        System.out.println("    * ");
//        System.out.println("   * ");
//        System.out.println("  * ");
//        System.out.println(" * ");

        {
            int x = 1;
            int y = x * x - 9;
            int c = 0;
            int v = 1;
            int k = 1;
            do {
                int j = 9;
                do {
                    System.out.print(" ");
                } while (--j > k);
                System.out.println("*");
                k = k + v;
            } while (--c > y);
            System.out.println();
        }



//        System.out.print("*       \n");
//        System.out.print("**      \n");
//        System.out.print("***     \n");
//        System.out.print("****    \n");
//        System.out.print("*****   \n");
//        System.out.print("******  \n");
//        System.out.print("******* \n");

        {
            int x = 3;
            int y = x * x - 1;
            int c = 2;
            int v = 1;
            int k = 1;
            do {
                int j = 0;
                do {
                    System.out.print("*");
                } while (++j < k);
                System.out.println();
                k += v;
            } while (++c <= y);
            System.out.println();
        }


//        System.out.print("******* \n");
//        System.out.print("******  \n");
//        System.out.print("*****   \n");
//        System.out.print("****    \n");
//        System.out.print("***     \n");
//        System.out.print("**      \n");
//        System.out.print("*       \n");

        {
            int x = 3;
            int y = x * x - 3;
            int c = 0;
            int v = 1;
            int k = 0;
            do {
                int j = 7;
                do {
                    System.out.print("*");
                } while (--j > k);
                System.out.println();
                k = k + v;
            } while (++c <= y);
            System.out.println();
        }



//        System.out.print("       *       \n");
//        System.out.print("      ***      \n");
//        System.out.print("     *****     \n");
//        System.out.print("    *******    \n");
//        System.out.print("   *********   \n");
//        System.out.print("  ***********  \n");
//        System.out.print(" ************* \n");
//        System.out.print("***************\n");


        {
            int x = 3;
            int m = x * x - 1;
            int i = 1;
            int d = 2;
            int w = 4;
            do {
                int j = 3;
                int v = 1;
                do {
                    System.out.print(" ");
                } while (++v <= 11 - x + 1);
                x++;
                do {
                    System.out.print("*");
                } while (++j < w);
                w = w + d;
                System.out.println();
            } while (++i <= m);
            System.out.println();
        }



//        System.out.print("        *        \n");
//        System.out.print("       ***       \n");
//        System.out.print("      *****      \n");
//        System.out.print("     *******     \n");
//        System.out.print("    *********    \n");
//        System.out.print("   ***********   \n");
//        System.out.print("  *************  \n");
//        System.out.print(" *************** \n");
//        System.out.print("*****************\n");
//        System.out.print(" *************** \n");
//        System.out.print("  *************  \n");
//        System.out.print("   ***********   \n");
//        System.out.print("    *********    \n");
//        System.out.print("     *******     \n");
//        System.out.print("      *****      \n");
//        System.out.print("       ***       \n");
//        System.out.print("        *        \n");

        {
            int x = 3;
            int m = x * x;
            int i = 1;
            int d = 2;
            int w = 4;
            int k = 3;
            int s = k * k;
            int l = 1;
            int g = 2;
            int b = 4;
            do {
                int j = 3;
                int v = 1;
                do {
                    System.out.print(" ");
                } while (++v <= 11 - x + 1);
                x++;
                do {
                    System.out.print("*");
                } while (++j < w);
                w = w + d;
                System.out.println();
            } while (++i <= m - 1);
            do {
                int h = 20;
                int y = 1;
                do {
                    System.out.print(" ");
                } while (++y <= 4 - k);
                k--;
                do {
                    System.out.print("*");
                } while (--h > b - 1);
                b = b + g;
                System.out.println();
            } while (++l <= s);
            System.out.println();
        }



// 2. Написать все фигуры только с границами
        System.out.println("____________________________________________");
        System.out.println("2. Написать все фигуры только с границами");
        System.out.println("____________________________________________");
        System.out.println();


//        System.out.println("* * * * *");
//        System.out.println("*       *");
//        System.out.println("*       *");
//        System.out.println("*       *");
//        System.out.println("*       *");
//        System.out.println("*       *");
//        System.out.println("*       *");
//        System.out.println("* * * * *");

        {
            int a = 8;
            int b = 5;
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if (i == 0 || i == a - 1 || j == 0 || j == b - 1) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }



//        System.out.print("*       \n");
//        System.out.print("**      \n");
//        System.out.print("* *     \n");
//        System.out.print("*  *    \n");
//        System.out.print("*   *   \n");
//        System.out.print("*    *  \n");
//        System.out.print("******* \n");

        {
            int c = 7;
            for (int i = 0; i < c; i++) {
                for (int j = 0; j < c; j++) {
                    if (j == i || j == 0 || i == c - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }



//        System.out.print("******* \n");
//        System.out.print("*    *  \n");
//        System.out.print("*   *   \n");
//        System.out.print("*  *    \n");
//        System.out.print("* *     \n");
//        System.out.print("**      \n");
//        System.out.print("*       \n");

        {
            int c = 7;
            for (int i = c; i > 0; i--) {
                for (int j = 1; j < c + 1; j++) {
                    if (j == i || j == 1 || i == c) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }



//        System.out.print("       *       \n");
//        System.out.print("      * *      \n");
//        System.out.print("     *   *     \n");
//        System.out.print("    *     *    \n");
//        System.out.print("   *       *   \n");
//        System.out.print("  *         *  \n");
//        System.out.print(" *           * \n");
//        System.out.print("***************\n");

        {
            int x = 8;
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x - i; j++) {
                    if (j == x - i - 1) {
                        for (int k = 0; k <= i * 2; k++) {
                            if (i == 0 || i == x - 1 || k == 0 || k == i * 2) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }



//        System.out.print("        *        \n");
//        System.out.print("       * *       \n");
//        System.out.print("      *   *      \n");
//        System.out.print("     *     *     \n");
//        System.out.print("    *       *    \n");
//        System.out.print("   *         *   \n");
//        System.out.print("  *           *  \n");
//        System.out.print(" *             * \n");
//        System.out.print("*               *\n");
//        System.out.print(" *             * \n");
//        System.out.print("  *           *  \n");
//        System.out.print("   *         *   \n");
//        System.out.print("    *       *    \n");
//        System.out.print("     *     *     \n");
//        System.out.print("      *   *      \n");
//        System.out.print("       * *       \n");
//        System.out.print("        *        \n");

        {
            int n = 9;
            for (int i = 1; i <= n; i++) {
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    if (j == 1 || j == 2 * i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for (int i = n - 1; i >= 1; i--) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    if (j == 1 || j == 2 * i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }



    }
}