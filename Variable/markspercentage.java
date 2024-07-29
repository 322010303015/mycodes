class markspercentage
{
    public static void main(String[] args)
    {
        int maths=45;
        int physics=65;
        int chemistry=48;
        int science=52;
        int max_marks=70;
        int total_marks=max_marks*4;
        float total=maths+physics+chemistry+science;
        float percentage=total/total_marks;
        float percent=percentage*100;
        System.out.println("Total Marks:"+total);
        System.out.println("Total percentage:"+percent);
    }
}