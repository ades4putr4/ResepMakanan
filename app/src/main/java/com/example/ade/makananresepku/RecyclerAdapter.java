package com.example.ade.makananresepku;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ADE on 10/4/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    //deklarasi variable context

    private final Context context;

    String [] resp={"1.kepiting fresh 5 ekor ( ukuran jumbo )\n 2.saus tiram 5 sendok makan\n 3.saus tomat 3 sendok makan\n 4.cabe rawit, 15 buah ( ulek halus )\n 5.merica bubuk ½ sendok teh\n 6.Garam halus dan air matang secukupnya\n 7.Penyedap rasa/vetsin dan gula pasir secukupnya."
            ,"- 500 gr nasi putih\n - 125 gr daging ayam yang telah dicincang halus\n - 1 butir telur ayam yang telah dikocok terlebih dahulu\n - 1 buah wortel yang telah dipotong dadu\n - 1/2 ikat sawi atau kol secukupnya yang telah dipotong-potong (sebagai sayur tambahan jika suka)\n - 2 sdm kecap manis\n - 1 sdt kecap asin\n - 1 sdt garam\n - 5 siung bawang merah"
            ,"500 gram jengkol\n 1 batang serai digeprek\n 3 cm lengkuas digeprek\n 2 lembar daun jeruk\n 1 lembar daun salam\n 3 butir cengkeh\n 1/2 sdt pala bubuk\n 1/2 sdt garam\n 1/2 sdt lada bubuk (merica/sahang)"
            ,"- 9 ons tortellini isi keju\n - 10 ons bayam, bersihkan, lalu potong batangnya\n - 1/3 cangkir keju parmesan\n - 2 cangkir tomat ceri, potong menjadi dua bagian\n - 2 ons buah zaitun hitam, potong-potong\n - 8 ons salad-dressing Italia"
            ,"1.Udang segar yang sudah dibersihkan dan dibuang kulitnya sebanyak 100 gram.\n 2.Daging ayam segar bagian dada sebanyak 100 gram. Potong kecil kecil.\n 3.Pentol bakso sapi sebanyak 5 buah. Iris tipis tipis atau sesual selera.\n 4.Bawang merah lokal ukuran sedang sebanyak 4 pcs. Kupas kulitnya dan potong kecil kecil untuk tumisan.\n 5.Bawang bombay ukuran sedang sebanyak 1 pcs. Kupas kulitnya dan potong tipis dengan arah agak melintang.\n 6.Bawang putih lokal ukuran besar sebanyak 4 pcs. Bersihkan kulitnya dan potong tipis tipis juga."
            ,"1.6 siung bawang merah\n 2.4 siung bawang putih\n 3.5 cabe keriting (kurangi jika ingin tidak terlalu pedas)\n 4.10 cabai merah besar\n 5.2 bh tomat\n 6.Garam dan gula secukupnya"};
    String[] detl={"-Bersihkan terlebih dahulu kepiting fresh yang beruluran jumbo dengan air yang mengalir hingga benar – benar bersih.\n -Selanjutnya rebus air hingga mendidih dan masukan kepiting fresh yang telah dibersihkan sampai matang.\n -Angakat, tiriskan dan sisihkan dahulu.\n -Haluskan terlebih dahulu bumbu seperti bawang putih, bawang merah dan cabai merah ulek sampai benar – benar halus.\n -Kemudian tumis bumbu yang telah dihaluskan aduk hingga rata dan masak sampai tercium aroma harum.\n -Masukan daun salam, lengkuas, jahe dan serai yang telah digeprek aduk rata.\n -Tuangkan air matang secukupnya dan biarkan sampai mendidih.\n -Masukan kepiting fresh yang telah direbus kedalam bumbu tumisan, aduk hingga rata.\n -Tambahakan penyedap rasa, garam dapur, gula pasir dan merica bubuk aduk hingga rata dan bumbu larut.\n -Lalu tambahkan pula cabe rawit, saus tomat dan saus tiram aduk hingga benar – benar rata dan masak hingga matang sempurna.\n -Jika dirasa sudah benar – benar matang, angkat dan tuangkan kedalam wadah saji.\n -Dan sajikan selagi hangat"
            ,"- Campurkan bawang merah, bawang putih dan cabai ke dalam cobek lalu uleg atau haluskan sampai rata\n - Masukkan minyak secukupnya ke dalam wajan, kemudian panaskan\n - Masukkan campuran bumbu yang telah dihaluskan ke dalam minyak yang telah panas, kemudian tumis hingga harum\n - Sisihkan bumbu yang telah ditumis pada pinggiran wajan, kemudian masukkan kocokan telur, aduk rata telur hingga menggumpal-gumpal kecil\n - Kemudian masukkan daging ayam yang telah dicincang halus, masak hingga warnanya berubah agak kuning kecoklatan"
            ,"1.Kupas kulit jengkol dan cuci bersih, kemudian rebus dengan air secukupnya bersama 8 lembar daun jambu selama 60 menit. Buang daun jambu dan air rebusan pertama, ganti dengan air dan 8 lembar daun jambu yang baru lalu rebus kembali selama 60 menit hingga jengkol menjadi empuk.\n 2.Angkat dan tiriskan jengkol, kemudian geprek-geprek namun tidak usah terlalu kuat hanya agar bumbu dapat meresap sempurna.\n 3.Panaskan sedikit minyak dalam wajan, lalu tumis bumbu halus, daun jeruk, daun salam, cengkeh, lengkuas dan serai hingga harum. Masukkan air dan jengkolnya serta aduk rata, setelah mendidih beri garam, pala, lada, kaldu bubuk dan kecap manis, aduk rata.\n 4.Masak hingga kuah mengental dan agak surut, jangan lupa aduk sesekali agar matang merata. Angkat dari wajan kemudian semur jengkol sudah siap untuk disajikan."
            ,"1. Dalam panci besar, masak air yang diberi sedikit garam. Kemudian masukkan pasta dan tunggu hingga al dente. Setelah itu, angkat pasta dan bersihkan dengan air dingin. Tiriskan.\n 2. Dalam mangkuk besar, campurkan pasta tortellini dengan bayam, keju, tomat dan buah zaitun. Tambahkan salad dressing. Kemudian aduk hingga merata.\n 3. Tambahkan juga garam dan merica sebagai bumbu tambahan, sesuai selera.\n 4. Salad bayam dan tortellini siap disajikan. Salad ini akan semakin nikmat jika dimakan bersama garlic bread, terutama yang berbentuk stik"
            ,"1.Siapkan penggorengan dengan api sedang dan beri sedikit minyak.\n 2.Masukkan bawang putih, bawang bomaby dan bawang merah yang sudah di iris tipis tipis. Tumis sebentar sambil diaduk sampai tercium bau harum.\n 3.Masukkan daging ayam yang sudah di potong potong dan udang yang sudah dibersihkan. Aduk aduk sebentar sampai setengah matang.\n 4.Tambahkan jahe yang sudah digeprak dan irisan tomatnya. Aduk sebentar sampai rata.\n 5.Tambahkan air sebanyak 50 ml. Aduk kembali semua bahan.\n 6.Masukkan semua sayurannya ke dalam penggorenga sambil diaduk aduk. Aduk aduk lagi sampai semua bahan tercampur rata dan agak setengah matang.\n 7.Masukkan 2 sendok makan saus ikan dan saus tiramnya. Aduk sebentar."
            ,"1.Iris terong ungu masing-masing menjadi 4 bagian kira-kira 10cm, tiap bagian potong memanjang menjadi empat bagian.\n 2.Rendam irisan terong ke dalam air agar terong tidak berubah warna. Kemudian di goreng hingga matang.\n 3.Kupas bawang merah dan bawang putih. Siapkan cabai keriting, cabai merah besar, dan tomat. Ulek sampai halus kemudian tambahkan gula dan garam sesuai selera\n 4.Setelah bumbu halus dan terong sudah matang, tumis bumbu dengan minyak yang sudah dipanaskan hingga wangi. Kemudian masukan terong dan aduk hingga merata."};
    String [] name={"Kepiting","Nasgor","Semur","Salad","capcay","terongbalado"};
    String [] deskripsi={"Menu seafood yang kerap menjadi incaran para pecinta kuliner salah satunya ialah kepiting saus tiram",
            "Nasi goreng rumahan dengan citarasa yang enak, gurih akan tetapi dalam pembuatannya simpel dan juga praktis dapat anda hadirkan di tengah keluarga anda.",
            "Alternatif lain dari olahan semur adalah semur jengkol. Semur jengkol merupakan varian semur menggunakan bahan dasar jengkol.",
            "Salad biasanya kita makan sebelum makan hidangan utama. Selain segar, salad juga bisa bikin kita merasakan rasa kenyang yang pas.",
            "Ingin menikmati berbagai macam sayuran dalam satu piring? Capcay goreng bakso bisa dijadikan menu piliha Anda. Sayur-sayuran sangat baik untuk kesehan Anda dan kelezatan bakso juga bisa Anda nikmati.",
            "Satu buah terong ungu bisa Anda olah dengan kelezatan yang oke punya"};
    // menampilkan list item dalam bentuk text dengan tipe data string dengan variable name
    Integer [] gambar={R.drawable.kepiting,R.drawable.nasgor,R.drawable.semur,R.drawable.tortellinisalad,R.drawable.capcay,R.drawable.terongbalado};
    LayoutInflater inflater;
    public RecyclerAdapter(Context context) {
        this.context=context;
        inflater=LayoutInflater.from(context);
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.tampilanrecycle, parent, false);

        RecyclerViewHolder viewHolder=new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.tv1.setText(name[position]);
        holder.tv1.setOnClickListener(clickListener);
        holder.tv2.setText(deskripsi[position]);
        holder.tv2.setOnClickListener(clickListener);

        holder.imageView.setOnClickListener(clickListener);
        holder.tv1.setTag(holder);
        holder.tv2.setTag(holder);
        holder.imageView.setTag(holder);
        holder.imageView.setImageResource(gambar[position]);

    }

    View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
//member aksi saat cardview diklik berdasarkan posisi tertentu
            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();

            int position = vholder.getPosition();

            Bundle b = new Bundle();

            // mengeset gambar ke bundle
            b.putInt("gambar",gambar[position]);
            b.putString("label","Resep "+name[position]);
            b.putString("resep",resp[position]);
            b.putString("procedur",detl[position]);




            Intent intent = new Intent(context , DetailkuActivity.class);
            intent.putExtras(b);
            context.startActivity(intent);


            //Toast.makeText(context, "Menu ini berada di posisi " + position, Toast.LENGTH_LONG).show();


        }
    };



    @Override
    public int getItemCount() {
        return name.length;
    }
}
