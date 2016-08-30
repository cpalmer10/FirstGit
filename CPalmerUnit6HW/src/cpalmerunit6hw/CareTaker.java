package cpalmerunit6hw;
public class CareTaker {
     // lose 1 life
    private int snooze = -1;
     // gain 2 life
    private int breakfast = 2;
     // gain 1 life 
    private int shower = 1;    
     // gain 1 life
    private int lunch = 1;
     // gain 2 life
    private int homework = 2;
     // lose 2 life;
    private int skip = -2;
     // no change
    private int ready = 0;
     // lose 1 life
    private int call = -1;
     // lose 2 life
    private int games = -2;
     // gain 1 life
    private int school = 1;
     // gain 2 life
    private int work = 2;
     // lose 2 life
    private int television = -2;
     // gain 1 life
    private int outside = 1;
     // lose 1 life
    private int inside = -1;
     // lose 2 life
    private int bed = -2;
     // set life to 0
    private int life = 0;

    public CareTaker() {
    }
    public CareTaker(int life) {
        this.life = life;
    }

    public CareTaker(int snooze, int breakfast, int shower, int lunch, int homework, int skip, int ready, int call, int games, int school, int work, int television, int inside, int outside, int bed) {
        this.snooze = snooze;
        this.breakfast = breakfast;
        this.shower = shower;
        this.lunch = lunch;
        this.homework = homework;
        this.skip = skip;
        this.ready = ready;
        this.call = call;
        this.games = games;
        this.school = school;
        this.work = work;
        this.television = television;
        this.inside = inside;
        this.outside = outside;
        this.bed = bed;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getOutside() {
        return outside;
    }

    public void setOutside(int outside) {
        this.outside = outside;
    }

    public int getInside() {
        return inside;
    }

    public void setInside(int inside) {
        this.inside = inside;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }
    
    
    
    public int getLife() {
        return life;
    }
    public int getSnooze() {
        return snooze;
    }

    public void setSnooze(int snooze) {
        this.snooze = snooze;
    }

    public int getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(int breakfast) {
        this.breakfast = breakfast;
    }

    public int getShower() {
        return shower;
    }

    public void setShower(int shower) {
        this.shower = shower;
    }

    public int getLunch() {
        return lunch;
    }

    public void setLunch(int lunch) {
        this.lunch = lunch;
    }

    public int getHomework() {
        return homework;
    }

    public void setHomework(int homework) {
        this.homework = homework;
    }

    public int getSkip() {
        return skip;
    }

    public void setSkip(int skip) {
        this.skip = skip;
    }

    public int getReady() {
        return ready;
    }

    public void setReady(int ready) {
        this.ready = ready;
    }

    public int getCall() {
        return call;
    }

    public void setCall(int call) {
        this.call = call;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getSchool() {
        return school;
    }

    public void setSchool(int school) {
        this.school = school;
    }

    public int getWork() {
        return work;
    }

    public void setWork(int work) {
        this.work = work;
    }

    public int getTelevision() {
        return television;
    }

    public void setTelevision(int television) {
        this.television = television;
    }

    
            
           
            
}
