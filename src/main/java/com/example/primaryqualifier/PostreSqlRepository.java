package com.example.primaryqualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary //bu annotation ile birden fazla implementasyon varsa öncelik verilir veya
@Qualifier("postreSqlRepository") //belirli bir implementasyon seçilir
public class PostreSqlRepository implements DatabaseConnection {

    @Override
    public void connect() {
        System.out.println("Connected to PostgreSQL database.");
    }
}

//bu şekilde yaptıktan sonra DI yapılırken
//@Qualifier("postreSqlRepository") veya @Qualifier("mongoDbRepository") ile
//hangi implementasyonun kullanılacağı belirtilebilir.
//Eğer @Primary kullanıldıysa, o zaman
//DI sırasında herhangi bir @Qualifier belirtilmezse,
//@Primary ile işaretlenen implementasyon kullanılacaktır.
