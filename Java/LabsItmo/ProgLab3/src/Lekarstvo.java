enum Lekarstvo {
    новокаин(123.2),
    пирамидон(321.4),
    стрептоцид(456.5),
    Белосалик(132.0),
    Декспантенол(433.4),
    Бетагистин(700.8),
    Быструмгель(455.2),
    Детралекс(443.4);
    Double price;
    Lekarstvo(Double Price){
        this.price = Price;
    }
    public Double getPrice(){
        return price;
    }
}
