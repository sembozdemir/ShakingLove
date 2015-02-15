package com.sembozdemir.semih3burcu;

import java.util.Random;

/**
 * Created by Semih Bozdemir on 11.2.2015.
 */
public class GuzelSozGenerator {
    public String[] mGuzelSoz = {
            //
            "Her şey biliyor her şey Sen biliyor musun bakalım Seni nice sevdiğimi Üstüne titrediğimi Geldiğimi Gittiğimi Hadi!",
            "Seni bir yaşam boyu bitirmek değil de, sana hep hep yeniden başlamak isterim.",
            "Ben utɑngɑç bir kɑlbi tɑşırım geceden..Ben sɑnɑ ɑşık olduğumu, ölsem söyleyemem.",
            "Seni bulmakdan önce aramak isterim. Seni sevmekten önce anlamak isterim. Seni bir yaşam boyu bitirmek değil de, sana hep hep yeniden başlamak isterim",
            "Ben senin en çok gülüşünü sevdim . Sevindiren, içimde umut çiçekleri açtıran. Unutturur bana birden acıları, güçlükleri. Dünyam aydınlanır sen güldüğün zaman",
            "En çok neresi mi ağzıydı elbet. Bütün duyarlıklara ayarlı. Öpüşlerin türlüsünden elhamra. Sınırsız denizinde çarşafların. Bir gider bir gelirdi işlek ağzı",
            "Çay bardağında Bırakılan dudak payı Kadar bile Uzak kalamam Gözlerine. Yakın olsun isterim Ellerime ellerin Yanındaki beton binaya Yaslanması gibi Köhne bir evin ",
            "Sevdamsın kara gözlüm. Aşkımsın huzur saçlım. Hüzün tenli canım Mürdüm dudaklım.",
            "Seni seviyorum. Sesini duymak istiyorum uyumadan önce. Sabahlara kadar konuşmak. Hiç kapatmamak telefonu. Aynı düşlere uyumak sonra. Ve uyanmak aynı güneşe.",
            "Ben sana mecburum bilemezsin. Adını mıh gibi aklımda tutuyorum. Büyüdükçe büyüyor gözlerin. Ben sana mecburum bilemezsin. İçimi seninle ısıtıyorum.",
            "Seni düşünmek güzel şey, ümitli şey, Dünyanın en güzel sesinden En güzel şarkıyı dinlemek gibi birşey... Fakat artık ümit yetmiyor bana, Ben artık şarkı dinlemek değil, Şarkı söylemek istiyorum.",
            "Yalnız aşkı vardır aşık olanın ve kaybetmek daha güç bulmaktan, sen yüzüne sürgün olduğum kadın.",
            "Adın geçti şiir defterimde ansızın, hesapsız. Ne de güzel geldin öyle aklıma.",
            "Sen esirliğimsin ve hürriyetimsin, çıplak bir yaz gecesi gibi yanan etimsin, sen memleketimsin.",
            "Bir rüya görür gibi. Seninle bulutlara uçtuğumda. Bir ateş yakar beni. Sevginle tutuştuğumu sanırdım. Yağmur olur damla damla. Öperdim öperdim dudaklarından",
            "Bırakma beni sevdiğim, Gidişine dayanamam, Hasret gözyaşlarımla, Kendimi avutamam, Dönerim dersin ama, Kadere inanmam, Bıraktığın anılarınla, Ben sensiz yaşayamam...",
            "Daha nen olayım isterdin, Onursuzunum senin!",
            "Saklarım gözümde güzelliğini, Her neye bakarsam sen varsın orda, Kalbimde gizlerim muhabbetini, Koymam yabancıyı sen varsın orda.",
            "Arasıra düşmüyor değil aklıma Yabancı kadınların sıcaklığı. Ama Allah bilir ya, ne saklıyayım Yanında ihtiyarlamak istiyorum...",
            "Zaman zaman anlardın aşk özetini zamanın içinde aşk olmasaydı böyle yanmazdın böyle serzenmezdin aşk özetinde seni seni bulmazdım...",
            "Senin adın bir çiçek Papatya gibisin Aşkımın simgesisin Benim güzel kadınım..",
            "Öperim dudɑklɑrındɑn gül kokulu yɑnɑklɑrındɑn her dem gözlerimin hɑpsindesin kɑlbimin tek sɑhibisin…",
            "Gönlüme tɑht kurdun, gönlümün sultɑnı oldun, gece gökyüzünde pɑrlɑyɑn yıldızım, sɑbɑh ise ruhumɑ doğɑn güneşim oldun.",
            "Doğɑn her günün sɑbɑhındɑ içimde gözlerini görebilmek ɑşkı olmɑsɑ, inɑn hiçbir şeye değmezdi yɑşɑmɑk.",
            "Yedi ayrı iklimden yedi çesit arı getirseler yedi çesit arı yedi ayrı çiçeği dolaşsa yedi ayrı çiçekten bal yapsa senin kadar tatlı olamaz.",
            "Seni bir yaşam boyu bitirmek değil de, Sana hep hep yeniden başlamak isterim.",
            "Kalbim, ellerim kadar küçük değil, ömrüm sevgin kadar büyük değil, hayalim sen kadar büyük değil, dertlerim sensizlik kadar siyah değil.",
            "Benim sevdasında bencil; ama yüreğinde sağlam sevdiğim.. Aklıma gelişini seveyim: Ne güzel darma duman ediyorsun beni.",
            "Aşkındı.. Kulağımda yankılanan sesi, yanık tenli vücutta söylenen birkaç nakarat müzikdi. Sen’di işte sen’di… Ne varsa sen’di..",
            "Oysa seni bir dine bağlanır gibi değil, kendi özgürlüğümü sever gibi seviyorum…",
            "Yokluğunun Iki Yakasını Bir Araya Getirip, Varlığını Ilikler Misin Ömrüme?",
            "Sen benim hayat romanımın altı çizili kalın harflerle yazılmış kısmısın.",
            "Bir yudum zehir olsan, biran bile düşünmeden seni içerdim, sırf seninle bir olmak ve seni içimde hissetmek için.",
            "Aşkındı.. Kulağımda yankılanan sesi, yanık tenli vücutta söylenen birkaç nakarat müzikdi. Sen’di işte sen’di… Ne varsa sen’di..",
            "Yanımda olmaman neyi değiştirir ki… Güneşte benden uzakta ayda. Ama hiç bir sabahım güneşsiz, hiç bir gecem aysız geçmiyor. Tıpkı yüreğimin senden geçmediği gibi…",
            "Nisan yağmuru yılanın ağzına düşünce zehir, midyenin ağzına düşünce inci olurmuş. Sen neyin yağmurusun ki yüreğime düşünce HERŞEYİM oldun!…",
            "Bilirim buz dağıdır özlem eflatun sabahlarda, bilirim kulaklarım çınladığında özleyenim vardır uzaklarda ve yine bilirim ki özleyenim özlediğimdir aslında!…",
            "Yağan yağmur gibisin hem duru hem huzur dolu, akan ırmak gibisin bazen sakin bazen deli dolu, denizde olan inci gibisin, hem birtanesin hemde çok değerlisin!…"
    };

    // Methods (abilities: things it can do)
    public String getGuzelSoz() {
        String guzelSoz = "";

        // Randomly select one of three answers: Yes, No, or Maybe
        Random randomGenerator = new Random(); // Construct a new Random number generator
        int randomNumber = randomGenerator.nextInt(mGuzelSoz.length);

        guzelSoz = mGuzelSoz[randomNumber];

        return guzelSoz;
    }
}
