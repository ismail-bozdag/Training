package org.example.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Get the names of all kids under the age of 18
public class UnderAge {
    public static void main(String[] args) {

    }

    public static Set<String> getKidNames(List<Person> people) {
        Set<String> kids = new HashSet<>();
        for (Person person : people) {
            if (person.getAge() < 18) {
                kids.add(person.getName());
            }
        }
        return kids;
    }
    public static Set<String> getKidNames2(List<Person> people) {

        return people.stream().filter(person -> person.getAge()<18)
                .map(person -> person.getName())
                .collect(Collectors.toSet());
    }
    /*Bu kod parçası Java Stream API'sini kullanarak işlem yapar. İlk önce, stream() methodu kullanılarak Person List'i bir Stream'e dönüştürülür.

Daha sonra, filter() methodu kullanılarak yaşı 18'in altında olan kişiler filtrelenir. Bu filtreleme işlemi için lambda ifadesi kullanılır. Eğer Person nesnesinin yaşı 18'den küçük ise, true döndürülür ve bu nesne Stream'de kalır.

map() methodu, Stream'deki her Person nesnesinin ismini elde etmek için kullanılır. Yani, bu adımla, Stream'deki her Person nesnesi, getName() methodu kullanılarak String tipine dönüştürülür.

Son olarak, collect() methodu kullanılarak, Stream'deki tüm adları bir Set koleksiyonuna toplanır. toSet() methodu kullanılmıştır çünkü sonuçta tekrar eden elemanların bulunmaması istenmiştir.

Bu yöntem, geleneksel bir döngü ile işlem yapmaktan daha az kod gerektirir ve Stream API'si sayesinde daha okunaklı bir hale getirilir.*/
}
