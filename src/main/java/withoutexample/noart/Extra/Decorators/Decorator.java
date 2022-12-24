package withoutexample.noart.Extra.Decorators;


public enum Decorator {
    PAPER, BASKET, RIBBON, NONE;

    public static double getPrice(Decorator decorator){
        if (decorator == Decorator.PAPER){return 15;}
        if (decorator == Decorator.BASKET){return 100;}
        if (decorator == Decorator.RIBBON){return 19;}
        return 0;
    }

}
