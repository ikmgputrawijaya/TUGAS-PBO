<h3><b>SELAMAT DATANG DI WEB MAKANAN ONLINE</b></h3>

<p>
 
 ikmgputrawijaya  = putrawijaya537@gmail.com
 ikmgptrwjy       = wijaya.2205551082@student.unud.ac.id
 
 
 - Mohon maaf sebelumnya, repositori ini dibuat pada akun github ini (email pribadi), tetapi saya tidak sadar bahwa Intellij yang saya pakai terhubung menggunakan akun udayana, sehingga commit yang dilakukan di Intellij atas nama akun udayana. Jadi terdapat 2 contributors pada repositori ini. Commit akhir dilakukan menggunakan akun ini (email pribadi), karena akun udayana saya yang terhubung dengan Intellij tidak dapat melakukan push (error entah mengapa dikarenakan saya pernah mencoba untuk kembali ke commit sebelumnya), terima kasih _/|\_.
 
 
Web makanan online merupakan program yang dibuat dengan menggunakan bahasa Java. Di mana terdapat dua role pada program ini, yaitu
admin dan customer. Admin dapat memiliki akses untuk melihat restaurant yang ada, menambahkan restaurant dan menambahkan menu. Admin juga dapat melihat menu pada suatu restaurant tertentu. Admin dapat menghapus restaurant yang telah ditambahkan saat program dijalankan. 
 Sedangkan customer dapat memiliki akses untuk melihat restaurant ang ada, membuat pesanan, dan melihat pesanan yang telah dibuat. Pertama-tama user diminta untuk log in berdasarkan rolenya. 
</p>

<p>

<h5>ADMIN</h5>
username admin  : sayaadmin
<br>
password admin  : 12345
1. Untuk login sebagai admin, user perlu menginputkan username dan password admin.
2. Pada menu admin, user dapat menginputkan 1 untuk melihat restaurant yang ada, apabila belum ada restaurant yang ditambahkan, maka akan muncul "Tidak Ada Restoran yang Terdaftar". 
3. User (admin) dapat menginputkan 2 untuk menambahkan restaurant, setelah menginputkan ID, nama, dan alamat restaurant maka user akan diberi pilihan untuk "1. Menambah menu", "2. Melihat menu", "3. Kembali ke halaman admin". Apabila admin menginputkan 1 pada halaman tambah menu, maka admin dapat menginputkan ID menu, nama, dan harganya. Apabila admin menginputkan 2 pada halaman lihat menu, maka selanjutnya admin akan diberikan pilihan restaurant mana yang ingin dilihat menunya. Apabila admin menginputkan 3 pada halaman tambah menu, maka admin akan kembali pada halaman admin.
4. Apabila admin menginputkan 3 pada halaman admin, maka admin dapat menghapus restaurant beserta menu yang telah ditambahkan sebelumnya. "Tidak Ada Restoran yang Terdaftar" akan muncul apabila belum ada menambahkan restaurant sebelumnya.
5. Apabila admin menginputkan 4 pada halaman admin, maka admin akan kembali ke halaman login.
</p>

<p>

<h5>CUSTOMER</h5>
username customer  : sayacustomer
<br>
password customer  : 12345
1. Untuk login sebagai customer, user perlu menginputkan username dan password customer. 
2. Pada menu customer, user dapat menginputkan 1 untuk melihat restaurant yang telah ditambahkan oleh admin sebelummnya. Apabila belum ada, maka akan muncul output "Tidak Ada Restoran yang Terdaftar". 
3. User (customer) dapat menginputkan 2 untuk membuat pesanan. Pertama, customer diminta untuk memilih restaurant yang ingin dikunjungi, lalu customer disajikan menu yang tersedia pada restaurant tersebut. Customer dapat menginputkan id menu yang ingin dipesan, kuantitas, dan jarak rumahnya.
4. Apabila customer menginputkan 3 pada halaman customer, maka customer dapat melihat pesanan yang telah dibuat sebelumnya, yang ditamplkan, yaitu nama restaurant, id restaurant, alamat, menu yang dipesan, jumlah, jarak rumah, dan total harga.
5. Apabila customer menginputkan 4 pada halaman customer, maka customer akan kembali ke halaman login.
</p>

<h4>UML</h4>


![UML](/uml.png "uml")


<br>

Terima kasih.
