public class car {
    public int distance,speed,fuel;
    public String owner;


    public void cruising(){
        if(speed>40){
            fuel-=5;
            distance+=1;
            System.out.println(owner+"'s car remaining fuel "+fuel+" litres");
        }
        else{
            fuel-=2;
            distance+=1;
            System.out.println(owner+"'s car remaining fuel "+fuel+" litres");
        }
    }

    public void refuel(){
            fuel+=20;
            System.out.println(owner+"'s car fuel increased by 20 litres and fuel left "+fuel+" litres");

    }
    public void gameover(){
        if(fuel==0){
            System.out.println(owner+"'s car run out of fuel");
        }
        else{
            System.out.println(owner+"'s car still cruising and already pass "+distance+" kilometers");
        }
    }
}

