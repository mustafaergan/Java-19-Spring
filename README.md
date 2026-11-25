# Spring MVC Ders Örnekleri

Java eğitiminin Spring bölümünde yazılan iki küçük Spring MVC projesi: biri XML ile, diğeri tamamen Java koduyla
yapılandırılmış.

> **Not:** Bu depo 2017 yılında eğitim amaçlı yazıldı ve artık güncellenmiyor. Bağımlılıkları eskidir ve bilinen güvenlik açıkları içerir; üretimde kullanmayın.

## İçerik

| Klasör | Ne yapar |
|---|---|
| `SpringMVC` | `web.xml` ve `mvc-dispatcher-servlet.xml` ile yapılandırılmış Spring MVC. `MerhabaController` (`/merhaba/...`) alan hesabı, `MatematikController` (`/matematik/toplama/{a}/{b}`) toplama yapıp sonucu JSP sayfasında gösterir. |
| `SpringMVCWithCode` | Aynı kurulumun XML'siz hâli: `WebInitializer`, `WebConfig` ve `ViewConfig` sınıfları. `/guvenlik/sorusturma` adresinde metin dönen bir `@RestController` örneği var. |

## Teknolojiler

- Java 8, Maven (`war` paketleme; kaynaklar `src/`, web içeriği `WebContent/` altında)
- Spring Framework 4.0.0 (Web MVC)
- Servlet 3.0, JSP/JSTL 1.2

## Çalıştırma

1. Eclipse'te **File > Import > Existing Maven Projects** ile ilgili klasörü içe aktarın.
2. `mvn package` ile `war` dosyasını üretin ya da projeyi Eclipse'ten bir Tomcat sunucusuna ekleyin.
3. Örnek adres: `http://localhost:8080/SpringMVC/matematik/toplama/3/5`
   (bağlam yolu, kurulum biçiminize göre değişebilir).
