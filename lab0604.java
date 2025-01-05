class piza {
    // Private instance variables to store the size of the pizza (either small,
    // medium, or large), the number of
    // cheese toppings, the number of pepperoni toppings, and the number of ham
    // toppings.

    private String size;
    private int cheesetopping;
    private int pepperonitopping;
    private int hamtopping;
    // Constructor(s) that set all of the instance variables.
    // Public methods to get and set the instance variables.

    piza() {
    }

    piza(String s, int ct, int pt, int ht) {
        this.size = s;
        this.cheesetopping = ct;
        this.pepperonitopping = pt;
        this.hamtopping = ht;

    }

    void setSize(String s) {
        this.size = s;
    }

    void setCheezeTopping(int a) {
        this.cheesetopping = a;
    }

    void setpepproniTopping(int a) {
        this.pepperonitopping = a;

    }

    void sethamtopping(int a) {
        this.hamtopping = a;
    }

    String getSize() {
        return size;
    }

    int getHamtopping() {
        return hamtopping;
    }

    int getpepronitopping() {
        return pepperonitopping;
    }

    int getCheesetopping() {
        return cheesetopping;
    }

    public double calCost() {
        // Small: $10 + $2 per topping Medium: $12 + $2 per topping Large: $14 + $2 per
        // topping
        if (size.equalsIgnoreCase("small")) {
            double p = 10;
            double top = 0;
            if (cheesetopping > 0) {
                top = top + (2 * cheesetopping);

            }
            if (hamtopping > 0) {
                top = top + (2 * hamtopping);

            }
            if (pepperonitopping > 0) {
                top = top + (2 * pepperonitopping);

            }
            p = p + top;
            return p;

        }

        if (size.equalsIgnoreCase("medium")) {
            double p = 12;
            double top = 0;
            if (cheesetopping > 0) {
                top = top + (2 * cheesetopping);

            }
            if (hamtopping > 0) {
                top = top + (2 * hamtopping);

            }
            if (pepperonitopping > 0) {
                top = top + (2 * pepperonitopping);

            }
            p = p + top;
            return p;

        }

        if (size.equalsIgnoreCase("large")) {
            double p = 14;
            double top = 0;
            if (cheesetopping > 0) {
                top = top + (2 * cheesetopping);

            }
            if (hamtopping > 0) {
                top = top + (2 * hamtopping);

            }
            if (pepperonitopping > 0) {
                top = top + (2 * pepperonitopping);

            }
            p = p + top;
            return p;

        } else {
            System.out.println("invalid size");
            return 0.0;
        }

    }

    // public method named getDescription( ) that returns a String containing the
    // pizza size, quantity of each
    // topping.

    public String getDescription() {
        return "Piza Size is:" + size +
                "Cheese Topping is: " + cheesetopping +
                "HamTopping is: " + hamtopping +
                "Pepproni Topping is: " + pepperonitopping;

    }

}

class pizaorder {
    private piza p1;
    private piza p2;
    private piza p3;

    pizaorder() {
    }

    pizaorder(piza p1, piza p2, piza p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public void setP1(piza p1) {
        this.p1 = p1;
    }

    void setp2(piza p2) {
        this.p2 = p2;
    }

    void setp3(piza p3) {
        this.p3 = p3;
    }

    piza getP1() {
        return p1;
    }

    piza getP2() {
        return p2;
    }

    piza getP3() {
        return p3;
    }

    /*
     * double calculateCost() {
     * double p;
     * if (p1.getSize().equalsIgnoreCase("small")) {
     * p = p + 10;
     * double top = 0;
     * if (p1.getCheesetopping() > 0) {
     * top = top + (2 * p1.getCheesetopping());
     * 
     * }
     * if (p1.getHamtopping() > 0) {
     * top = top + (2 * p1.getHamtopping());
     * 
     * }
     * if (p1.getpepronitopping > 0) {
     * top = top + (2 * p1.getpepronitopping());
     * 
     * }
     * p = p + top;
     * 
     * }
     * 
     * else if (p1.getSize().equalsIgnoreCase("medium")) {
     * p = 12;
     * double top = 0;
     * if (p1.getCheesetopping() > 0) {
     * top = top + (2 * p1.getCheesetopping());
     * 
     * }
     * if (p1.getHamtopping() > 0) {
     * top = top + (2 * p1.getHamtopping());
     * 
     * }
     * if (p1.getpepronitopping() > 0) {
     * top = top + (2 * p1.getpepronitopping());
     * 
     * }
     * p = p + top;
     * 
     * }
     * 
     * else if (p1.getSize().equalsIgnoreCase("large")) {
     * p = 14;
     * double top = 0;
     * if (p1.getCheesetopping() > 0) {
     * top = top + (2 * p1.getCheesetopping());
     * 
     * }
     * if (p1.getHamtopping() > 0) {
     * top = top + (2 * p1.getHamtopping());
     * 
     * }
     * if (p1.getpepronitopping() > 0) {
     * top = top + (2 * p1.getpepronitopping());
     * 
     * }
     * p = p + top;
     * 
     * }
     * if (p3.getSize().equalsIgnoreCase("small")) {
     * p = p + 10;
     * double top = 0;
     * if (p3.getCheesetopping() > 0) {
     * top = top + (2 * p3.getCheesetopping());
     * 
     * }
     * if (p3.getHamtopping() > 0) {
     * top = top + (2 * p3.getHamtopping());
     * 
     * }
     * if (p3.getpepronitopping > 0) {
     * top = top + (2 * p3.getpepronitopping());
     * 
     * }
     * p = p + top;
     * 
     * }
     * 
     * else if (p3.getSize().equalsIgnoreCase("medium")) {
     * p = 12;
     * double top = 0;
     * if (p1.getCheesetopping() > 0) {
     * top = top + (2 * p3.getCheesetopping());
     * 
     * }
     * if (p3.getHamtopping() > 0) {
     * top = top + (2 * p3.getHamtopping());
     * 
     * }
     * if (p3.getpepronitopping() > 0) {
     * top = top + (2 * p3.getpepronitopping());
     * 
     * }
     * p = p + top;
     * 
     * }
     * 
     * else if (p3.getSize().equalsIgnoreCase("large")) {
     * p = 14;
     * double top = 0;
     * if (p3.getCheesetopping() > 0) {
     * top = top + (2 * p3.getCheesetopping());
     * 
     * }
     * if (p3.getHamtopping() > 0) {
     * top = top + (2 * p3.getHamtopping());
     * 
     * }
     * if (p3.getpepronitopping() > 0) {
     * top = top + (2 * p3.getpepronitopping());
     * 
     * }
     * p = p + top;
     * 
     * }
     * if (p2.getSize().equalsIgnoreCase("small")) {
     * p = p + 10;
     * double top = 0;
     * if (p2.getCheesetopping() > 0) {
     * top = top + (2 * p2.getCheesetopping());
     * 
     * }
     * if (p2.getHamtopping() > 0) {
     * top = top + (2 * p2.getHamtopping());
     * 
     * }
     * if (p2.getpepronitopping > 0) {
     * top = top + (2 * p2.getpepronitopping());
     * 
     * }
     * p = p + top;
     * 
     * }
     * 
     * else if (p2.getSize().equalsIgnoreCase("medium")) {
     * p = 12;
     * double top = 0;
     * if (p1.getCheesetopping() > 0) {
     * top = top + (2 * p2.getCheesetopping());
     * 
     * }
     * if (p1.getHamtopping() > 0) {
     * top = top + (2 * p2.getHamtopping());
     * 
     * }
     * if (p1.getpepronitopping() > 0) {
     * top = top + (2 * p2.getpepronitopping());
     * 
     * }
     * p = p + top;
     * 
     * }
     * 
     * else if (p2.getSize().equalsIgnoreCase("large")) {
     * p = 14;
     * double top = 0;
     * if (p2.getCheesetopping() > 0) {
     * top = top + (2 * p2.getCheesetopping());
     * 
     * }
     * if (p2.getHamtopping() > 0) {
     * top = top + (2 * p2.getHamtopping());
     * 
     * }
     * if (p2.getpepronitopping() > 0) {
     * top = top + (2 * p2.getpepronitopping());
     * 
     * }
     * p = p + top;
     * 
     * }
     * return p;
     * 
     * }
     */
    public double calculateCost() {
        double totalCost = 0;
        if (p1 != null)
            totalCost += p1.calCost();
        if (p2 != null)
            totalCost += p2.calCost();
        if (p3 != null)
            totalCost += p3.calCost();
        return totalCost;
    }

}

public class lab0604 {
    public static void main(String[] args) {
        piza p1 = new piza("large", 1, 1, 2);
        piza p2 = new piza("large", 1, 1, 2);
        piza p3 = new piza("large", 1, 1, 2);
        // piza p3 = new piza();

        System.out.println(p1.calCost());
        System.out.println(p1.getDescription());
        System.out.println(p2.calCost());
        System.out.println(p2.getDescription());
        pizaorder o1 = new pizaorder(p1, null, null);
        System.out.println(o1.calculateCost());

    }

}
