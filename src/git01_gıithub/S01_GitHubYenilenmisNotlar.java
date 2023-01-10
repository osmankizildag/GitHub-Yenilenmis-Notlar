package git01_gıithub;

public class S01_GitHubYenilenmisNotlar {

/*
(Collaboration Projede Yetkilendirme)

Settings ==>Collabrotars ==>Add people ==>
(çıkan kutucuğa yetkilendirilecek kişinin email'i yazılır ve Add yapılır.
Email' e davet mektubu gider. Kabul beklenir) ==>
Manage access (burada 'collabrator' yazıyorsa daveti kabul etmiş demektir.
Artık kişi projeyi görebilir ve projede çalışabilir)
-----------------------------------------------------------------------------------------------
(GitHub'daki dosyayı Clone'layıp bilgisayara getirme)

File==>New==>Project from Version Control ==>	Clone	==> (kopyala yapıştır)

(Terminale gidilir)			git init
        					git add .
		        			git commit -m"ilk commit"
				        	git branch -M main
					        git remote add origin (clone yapıştır)
					        git push -u origin main
                                                            çıkan mesaj ( Everything up-to-date)
(uzak masaüstü ile local irtibatlandı)

(şimdi branch oluşturalım)		git branch isim
					            git checkout isim
                                                            çıkan mesaj (*isim)

(Artık classlarda değişiklik yapılabilir ve kaydedilebilir)	    git add .
								                                git commit -m "değişiklik tarihi isim"

(Collabrator değişikliği GitHub'a göndermeli)		git push
(sistem kabul etmeyecek)	 				        git push --set upstream origin isim
								                    ('bu komutu kullanmalısın'uyarısını verecek)
(Komutu yaz ve enter. Değişiklik GitHub'a gitti)
Eşzamanlı olarak 2 link gelir. Üstteki link, bizi birleştirme isteği sayfasına götürür.
-------------------------------------------------------------------------------------------------
(şimdi sıra uzak masaüstündeki birleştirmeye geldi)

Github ==> main	(sayfayı yenileyince collabrator'ın değişikliği bu menüye gelir)

(Collabrotar yaptığı değişikliğin birleştirilmesi için Admin'den istekte bulunmalı)
GitHub ==> pull request	==> kutucuğa (yorum yazılabilir) ==> Creat pull request
--------------------------------------------------------------------------------------------------
Admin, "merge pull request" tusuna basarak değişikliği kabul eder.
İçeriği kontrol eder. Varsa conflicti düzeltmelidir. Herşey yolundaysa merge yapar.
Artık herkes git pull yapabilir/yapmalıdır.
--------------------------------------------------------------------------------------------------
git checkout main
git pull    (sonra derhal main'den çık)
git checkout isim
git merge main	(kendi branchimize kopyalıyoruz) (Already up to date.). işlem Tamam.
--------------------------------------------------------------------------------------------------
Not.1- main branch'de admin dahil kimse işlem yapmamalı
Not.2- main branch sadece pull için kullanılmalı sonra oradan süratle çıkılmalı
Not.3- hergün ilk iş git pull yapılmalı
---------------------------------------------------------------------------------------------------
 */
}
