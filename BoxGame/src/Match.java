public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    boolean whoStarts(){
        return Math.random() > 0.5 ? false: true;
    }

    void run() {
        if (checkWeight()) {
            if(whoStarts() == false) {
                System.out.println("İlk oyuncu başlıyor");
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("======== YENİ ROUND ===========");
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }
            }else {
                System.out.println("İkinci oyuncu başlıyor.");
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("======== YENİ ROUND ===========");
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }
            }
        } else {
            System.out.println("Sporcuların sikletleri uyuşmuyor.");
        }
    }

    boolean checkWeight() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println("Maçı Kazanan : " + this.f2.name);
            return true;
        } else if (this.f2.health == 0){
            System.out.println("Maçı Kazanan : " + this.f1.name);
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}
