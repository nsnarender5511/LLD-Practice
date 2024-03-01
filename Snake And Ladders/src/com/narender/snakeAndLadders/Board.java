package com.narender.snakeAndLadders;

public class Board {
    public static Item[] snakes;

    public static Item[] ladders;

    public static void loadItems(){
        ladders = new Item[2];
        ladders[0] = new Item(51,87,"LADDER");
        ladders[1] = new Item(11,47,"LADDER");

        snakes = new Item[4];
        snakes[0] = new Item(32,13, "SNAKE");
        snakes[1] = new Item(67,9, "SNAKE");
        snakes[2] = new Item(68,8, "SNAKE");
        snakes[3] = new Item(97,3, "SNAKE");

    }

    public void create(){
        loadItems();
    }

    public static int checlSnakes(int position){
        for(int i=0;i<4;i++){
            if(snakes[i].getStart() == position){
                System.out.println("##__SNAKE  ::  bitten at " + position + " :: Moving to " + snakes[i].getEnd());
                return snakes[i].getEnd();
            }
        }
        return position;
    }

    public static int checkLadders(int position){
        for(int i=0;i<2;i++){
            if(ladders[i].getStart() == position){
                System.out.println("##__LADDER  ::  found at " + position + " :: Moving to " + ladders[i].getEnd());
                return ladders[i].getEnd();
            }
        }
        return position;
    }

    public void play(Player p1, Player p2){
        int i = 0;
        Dice dice = new Dice();
        while(p1.getScore() != 100 || p2.getScore() != 100){

            if(i%2 == 0){
                dice.roll(p1);
                move(p1, dice);
            } else {
                dice.roll(p2);
                move(p2, dice);
            }

            i++;
        }
    }

    public void move(Player player, Dice dice){
        int currScore = player.getScore();
        int finalScore = currScore + dice.getVal();
        if(finalScore > 100){
            System.out.println("##__CAN'TMOVE  ::  dice Value  " + dice.getVal() + " Aready at   " + currScore);
        } else {

            /*  Can we Implement Something like
            *
            *  player.checkSnakes().checkLadders().move()
            *
            * */


            finalScore = checlSnakes(finalScore);
            finalScore = checkLadders(finalScore);
            player.setScore(finalScore);

            System.out.println("##__MOVE  ::  " + player.getName() + "  --  has Moved to  ::  " + player.getScore());

        }
    }


}
