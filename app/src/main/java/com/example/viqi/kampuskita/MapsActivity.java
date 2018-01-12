package com.example.viqi.kampuskita;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //add a maps
        LatLng bdg = new LatLng(-6.914744, 107.609810);

        // Add Objek Univ Negeri
        LatLng uinbdg = new LatLng(-6.9312884,107.7151366);
        LatLng itb = new LatLng(-6.89148,107.6084704);
        LatLng unpad = new LatLng(-6.8933901,107.6153765);
        LatLng upi = new LatLng(-6.8611656,107.5907582);
        LatLng polpos = new LatLng(-6.8731953,107.5737873);
        LatLng polman = new LatLng(-6.8774731,107.6183414);
        LatLng polban = new LatLng(-6.8720341,107.572605);
        LatLng sttt = new LatLng(-6.9130768,107.6376554);
        LatLng stparnhi = new LatLng(-6.8683591,107.592432);
        LatLng isbi = new LatLng(-6.9430811,107.6258936);
        LatLng stks = new LatLng(-6.8726079,107.6168347);
        LatLng poltekkeskemenkes = new LatLng(-6.8954226,107.6001794);

        // Add Objek Univ Swasta
        LatLng telkomu = new LatLng(-6.974001,107.6281593);
        LatLng unisba = new LatLng(-6.9038046,107.6057853);
        LatLng uninus = new LatLng(-6.945371,107.6424863);
        LatLng unparpusat = new LatLng(-6.8749127,107.6028818);
        LatLng unpardtiga = new LatLng(-6.9097831,107.6081832);
        LatLng maranatha = new LatLng(-6.8855536,107.5787956);
        LatLng utama = new LatLng(-6.8980099,107.6425637);
        LatLng ypkp = new LatLng(-6.899529,107.6380783);
        LatLng ypkpdua = new LatLng(-6.89841,107.6298113);
        LatLng unikom = new LatLng(-6.8868245,107.6131064);
        LatLng unjanicimahi = new LatLng(-6.8877086,107.5245237);
        LatLng unjanigatsu = new LatLng(-6.9341684,107.6440292);
        LatLng unla = new LatLng(-6.9313812,107.6132396);
        LatLng unnurtanio = new LatLng(-6.9063718,107.5796468);
        LatLng unpassatu = new LatLng(-6.9289866,107.6105522);
        LatLng unpasdua = new LatLng(-6.9047572,107.6061246);
        LatLng unpastiga = new LatLng(-6.8664078,107.5905854);
        LatLng bsicaheum = new LatLng(-6.9103549,107.6475295);
        LatLng bsicikutra = new LatLng(-6.903449,107.6409683);
        LatLng unibi = new LatLng(-6.942226,107.6485833);
        LatLng advent = new LatLng(-6.8018242,107.5762072);

        // Add Objek Institut Swasta
        LatLng ITA = new LatLng(-6.927025,107.6241383);
        LatLng ITHB = new LatLng(-6.8887413,107.6137569);
        LatLng ITENAS = new LatLng(-6.897719,107.6335483);

        // Add Objek Politeknik Swasta
        LatLng GANESHA = new LatLng(-6.9283426,107.6377176);
        LatLng GANUBA = new LatLng(-6.9449374,107.6400582);
        LatLng GEOLOGI = new LatLng(-6.911759,107.6583898);
        LatLng INDUSTRI = new LatLng(-6.937063,107.6658463);
        LatLng LPKIA = new LatLng(-6.9499146,107.6224431);
        LatLng PKB = new LatLng(-6.9584944,107.5894211);
        LatLng LP3I = new LatLng(-6.8968537,107.6319926);
        LatLng IGASA = new LatLng(-6.9114013,107.5964034);
        LatLng PIKSI = new LatLng(-6.9283426,107.6355289);
        LatLng PRAKTISI = new LatLng(-6.910178,107.608647);
        LatLng TELKOM = new LatLng(-6.973665,107.6293203);
        LatLng TEDC = new LatLng(-6.8735962,107.5599057);
        LatLng ALISLAM = new LatLng(-6.9293378,107.6779075);
        LatLng KESEHATAN = new LatLng(-6.8652599,107.6032393);

        // Add Objek Sekolah Tinggi Swasta
        LatLng stekuitas = new LatLng(-6.897996,107.6356809);
        LatLng stinaba = new LatLng(-6.9499423,107.620539);
        LatLng stkridatama = new LatLng(-6.960443,107.5877133);
        LatLng ststanim = new LatLng(-6.913618,107.6408413);
        LatLng ststembi = new LatLng(-6.9312727,107.6149339);
        LatLng sttridharma = new LatLng(-6.9456531,107.6383348);

        LatLng stkippasundan = new LatLng(-6.8588797,107.5505267);
        LatLng stkippersis = new LatLng(-6.9262374,107.5984449);
        LatLng stkipsiliwangi = new LatLng(-6.8881689,107.5281732);

        LatLng sttbdg = new LatLng(-6.9481242,107.5989453);
        LatLng sttmandala = new LatLng(-6.9438922,107.6421556);
        LatLng sttnasional = new LatLng(-6.8848237,107.6191293);

        LatLng stba = new LatLng(-6.8918966,107.6021549);
        LatLng stdi = new LatLng(-6.9039437,107.6024623);
        LatLng sthb = new LatLng(-6.906488,107.6024604);
        LatLng stiabdg = new LatLng(-6.901145,107.6250143);
        LatLng stiacmh = new LatLng(-6.8939566,107.5158649);
        LatLng stikombdg = new LatLng(-6.945548,107.6384173);
        LatLng stmbtelkom = new LatLng(-6.851335,107.5958593);
        LatLng stpertanianbale = new LatLng(-7.0013666,107.6228804);

        LatLng stikesrajawali = new LatLng(-6.9124831,107.5711862);
        LatLng stikesbk = new LatLng(-6.9364752,107.7078359);
        LatLng stikesdharma = new LatLng(-6.9124637,107.6487181);
        LatLng stikesimanuel = new LatLng(-6.9370227,107.5940894);
        LatLng stikesahmadyani = new LatLng(-6.8872952,107.526707);
        LatLng stikesboromeus = new LatLng(-6.864983,107.4732153);
        LatLng stikesaisyiyah = new LatLng(-6.9329473,107.6216432);

        // Add Objek Akademi  Swasta
        LatLng akakuntansi = new LatLng(-6.9086887,107.6079627);
        LatLng akbasing = new LatLng(-6.9191257,107.5720667);
        LatLng akbidtridharma = new LatLng(-6.8661942,107.5103135);
        LatLng akperbk = new LatLng(-6.9198674,107.7066319);
        LatLng akperkebon = new LatLng(-6.9364308,107.6566702);
        LatLng akparnasional = new LatLng(-6.8817407,107.5961237);
        LatLng akparnhi = new LatLng(-6.8761546,107.5884046);
        LatLng akparsandhy = new LatLng(-6.9252151,107.622786);
        LatLng akperinforkes = new LatLng(-6.901513,107.6249923);
        LatLng ariyanti = new LatLng(-6.905114,107.5952335);
        LatLng tarunabakti = new LatLng(-6.9055384,107.6176474);
        LatLng aktataboga = new LatLng(-6.9372296,107.7307694);
        LatLng akaero = new LatLng(-6.9069255,107.5889136);
        LatLng amikhass = new LatLng(-6.9343451,107.6298863);


        // Add Marker Institut Swasta
        mMap.addMarker(new MarkerOptions().position(ITA).title("Institut Teknologi Adityawarman").snippet("Jl. Terusan Halimun No.37, Lkr. Sel., Lengkong, Kota Bandung, Jawa Barat 40263").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(ITHB).title("Institut Teknologi Harapan Bangsa").snippet("Jalan Dipatiukur No. 80-84, Lebakgede, Coblong, Lebakgede, Coblong, Kota Bandung, Jawa Barat 40132").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(ITENAS).title("Institut Teknologi Nasional").snippet("Jalan PH.H. Mustofa No.23, Neglasari, Cibeunying Kaler, Neglasari, Cibeunying Kaler, Kota Bandung, Jawa Barat 40124").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));

        // Add Marker Politeknik Swasta
        mMap.addMarker(new MarkerOptions().position(GANESHA).title("Politeknik Ganesha bandung").snippet("Jl. Jendral Gatot Subroto, Maleer, Batununggal, Kota Bandung, Jawa Barat 40274").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(GANUBA).title("Politeknik Garuda Nusantara Bandung").snippet("JL. Kiaracondong, No. 81-81 A, Bandung, Binong, Batununggal, Bandung City, West Java 40286").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(GEOLOGI).title("Politeknik Geologi & Pertambangan").snippet("Jl. Cisaranten Kulon No.40, Cisaranten Kulon, Arcamanik, Kota Bandung, Jawa Barat 40293").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(INDUSTRI).title("Politeknik Industri dan Niaga Bandung").snippet("Jl. Soekarno Hatta No.729, Jatisari, Buahbatu, Kota Bandung, Jawa Barat 40286").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(LPKIA).title("Politeknik Komputer Niaga LPKIA").snippet("Jl. Soekarno Hatta No.456, Batununggal, Bandung Kidul, Kota Bandung, Jawa Barat 40266").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(PKB).title("Politeknik Kridatama Bandung").snippet("JL. Terusan Borobudur, No. 1-4, Bandung, Cibaduyut Kidul, Bojongloa Kidul, Bandung City, West Java 40238").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(LP3I).title("Politeknik LP3I Bandung").snippet("Jalan Pahlawan No.59, Sukaluyu, Cibeunying Kaler, Sukaluyu, Cibeunying Kaler, Kota Bandung, Jawa Barat 40123").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(IGASA).title("Politeknik Manufaktur Igasar Pindad").snippet("Jl. Kiaracondong No.206, Binong, Batununggal, Kota Bandung, Jawa Barat 40286").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(PIKSI).title("Politeknik Piksi Ganesha").snippet("Jl. Jendral Gatot Subroto, Maleer, Batununggal, Kota Bandung, Jawa Barat 40274").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(PRAKTISI).title("Politeknik Praktisi Bandung").snippet("Jalan Merdeka No.46, Kec.Sumur Bandung, Babakan Ciamis, Sumur Bandung, Kota Bandung, Jawa Barat 40117").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(TELKOM).title("Politeknik Telkom").snippet("Jl. Telekomunikasi No. 01, Terusan Buah Batu, Sukapura, Dayeuhkolot, Sukapura, Dayeuhkolot, Bandung, Jawa Barat 40257").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(TEDC).title("Politeknik TEDC Bandung").snippet("Jl. Politeknik - Pasantren KM. 2 Lantai 1, Cibabat, Cimahi Utara, Cibabat, Cimahi Utara, Kota Cimahi, Jawa Barat 40513").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(ALISLAM).title("Politeknik Al-Islam Bandung").snippet("Jl. Cisaranten Kulon No.120, Cisaranten Kulon, Arcamanik, Kota Bandung, Jawa Barat 40293").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(KESEHATAN).title("Politeknik Kesehatan TNI AU").snippet("Jl. Rereongan Sarupi, Ciumbuleuit, Cidadap, Kota Bandung, Jawa Barat 40142").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));


        mMap.addMarker(new MarkerOptions().position(stks).title("Sekolah Tinggi Kesejahteraan Sosial Bandung").snippet("Jalan Ir. H.Djuanda No.367, Dago, Coblong, Dago, Coblong, Dago, Coblong, Kota Bandung, Jawa Barat 40135").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_gr)));
        mMap.addMarker(new MarkerOptions().position(uinbdg).title("Universitas Islam Negeri Sunan Gunung Djati").snippet("Jalan A.H. Nasution No. 105, Cipadung, Cibiru, Cipadung, Cibiru, Kota Bandung, Jawa Barat 40614").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_gr)));
        mMap.addMarker(new MarkerOptions().position(itb).title("Institut Teknologi Bandung").snippet("Jl. Ganesha No.10, Lb. Siliwangi, Coblong, Kota Bandung, Jawa Barat 40132").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_gr)));
        mMap.addMarker(new MarkerOptions().position(unpad).title("Universitas Padjadjaran").snippet("Jalan Dipatiukur No. 35, Lebakgede, Coblong, Lebakgede, Coblong, Kota Bandung, Jawa Barat 40132").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_gr)));
        mMap.addMarker(new MarkerOptions().position(upi).title("Universitas Pendidikan Indonesia").snippet("Jl. Setiabudhi No.229, Isola, Sukasari, Isola, Sukasari, Kota Bandung, Jawa Barat 40154").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_gr)));
        mMap.addMarker(new MarkerOptions().position(polpos).title("Politeknik POS Indonesia").snippet("Jalan Sariasih No.54, Sarijadi, Sukasari, Kota Bandung, Jawa Barat 40151").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_gr)));
        mMap.addMarker(new MarkerOptions().position(polman).title("Politeknik Manufaktur Negeri Bandung").snippet("Jl. Kanayakan No.21, Dago, Coblong, Kota Bandung, Jawa Barat 40135").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_gr)));
        mMap.addMarker(new MarkerOptions().position(polban).title("Politeknik Negeri Bandung").snippet("Jalan Kampus Polban, Ciwaruga, Parongpong, Ciwaruga, Parongpong, Kabupaten Bandung Barat, Jawa Barat 40559").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_gr)));
        mMap.addMarker(new MarkerOptions().position(sttt).title("Sekolah Tinggi Teknologi Tekstil").snippet("Jalan Jakarta No.31, Kebonwaru, Batununggal, Kebonwaru, Batununggal, Kota Bandung, Jawa Barat 40272").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_gr)));
        mMap.addMarker(new MarkerOptions().position(stparnhi).title("Sekolah Tinggi Pariwisata Bandung [NHI]").snippet("Jalan Setiabudhi No.186, Hegarmanah, Cidadap, Hegarmanah, Cidadap, Kota Bandung, Jawa Barat 40141").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_gr)));
        mMap.addMarker(new MarkerOptions().position(isbi).title("Institut Seni Budaya Indonesia Bandung").snippet("Jl. Buah Batu No.212, Cijagra, Lengkong, Kota Bandung, Jawa Barat 40265").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_gr)));
        mMap.addMarker(new MarkerOptions().position(poltekkeskemenkes).title("Politeknik Kesehatan Kemenkes Bandung").snippet("Jl. Pajajaran No.56, Cicendo, Bandung, Jawa Barat 40171").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_gr)));

        // Add Marker Univ Swasta
        mMap.addMarker(new MarkerOptions().position(telkomu).title("Telkom University Bandung").snippet("Jl. Telekomunikasi No. 01, Terusan Buah Batu, Sukapura, Dayeuhkolot, Sukapura, Dayeuhkolot, Bandung, Jawa Barat 40257").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(unisba).title("Universitas Islam Bandung").snippet("Jalan Taman Sari No.01, Tamansari, Bandung Wetan, Tamansari, Bandung Wetan, Kota Bandung, Jawa Barat 40116").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(uninus).title("Universitas Islam Nusantara").snippet("Jl. Soekarno Hatta No.530, Sekejati, Buahbatu, Kota Bandung, Jawa Barat 40286").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(unparpusat).title("Universitas Katolik Parahyangan (Pusat)").snippet("Jalan Ciumbuleuit No. 94, Hegarmanah, Cidadap, Hegarmanah, Cidadap, Kota Bandung, Jawa Barat 40141").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(unpardtiga).title("Universitas Katolik Parahyangan (D3 Manajemen Perusahaan)").snippet("Jl. Aceh, Babakan Ciamis, Bandung Wetan, Kota Bandung, Jawa Barat 40116").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(maranatha).title("Universitas Kristen Maranatha").snippet("Jalan Prof. Drg. Surya Sumantri No.65, Sukawarna, Bandung, Jawa Barat, 40164").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(utama).title("Widyatama University").snippet("Jalan Cikutra No.204A, Sukapada, Cibeunying Kidul, Sukapada, Cibeunying Kidul, Kota Bandung, Jawa Barat 40125").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(ypkp).title("Universitas Sangga Buana YPKP").snippet("Jl.PH.H.Mustofa No.68, Cikutra, Cibeunying Kidul, Cikutra, Cibeunying Kidul, Kota Bandung, Jawa Barat 40124").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(ypkpdua).title("Universitas Sangga Buana YPKP (Kampus 2)").snippet("Jl. PHH Mustofa No.68, Sukaluyu, Cibeunying Kaler, Kota Bandung, Jawa Barat 40123").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(unikom).title("Universitas Komputer Indonesia").snippet("Jalan Dipatiukur No. 112-116, Coblong, Lebakgede, Bandung, Lebakgede, Coblong, Kota Bandung, Jawa Barat 40132").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(unjanicimahi).title("Universitas Jenderal Achmad Yani (Kampus Cimahi)").snippet("Jalan Terusan Jendral Sudirman, Cimahi, Cibeber, Cimahi Sel., Jawa Barat, 40285").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(unjanigatsu).title("Universitas Jenderal Achmad Yani (Kampus Gatsu)").snippet("Jl. Terusan Jenderal Gatot Subroto, Sukapura, Kiaracondong, Kota Bandung, Jawa Barat 40285").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(unla).title("Universitas Langlang Buana").snippet("Jalan Karapitan No.116, Cikawao, Lengkong, Cikawao, Lengkong, Kota Bandung, Jawa Barat 40261").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(unnurtanio).title("Universitas Nurtanio").snippet("Husein Sastranegara, No. 219, Jalan Pajajaran, Cicendo, Husen Sastranegara, Cicendo, Kota Bandung, Jawa Barat 40174").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(unpassatu).title("Universitas Pasundan (Kampus Satu)").snippet("Jl. Lengkong Besar No.68, Cikawao, Lengkong, Kota Bandung, Jawa Barat 40261").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(unpasdua).title("Universitas Pasundan (Kampus Dua)").snippet("Jl. Tamansari No. 6-8, Tamansari, Bandung Wetan, Tamansari, Bandung Wetan, Kota Bandung, Jawa Barat 40116").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(unpastiga).title("Universitas Pasundan (Kampus Tiga)").snippet("Jalan Dokter Setiabudhi No.193, Gegerkalong, Sukasari, Gegerkalong, Sukasari, Kota Bandung, Jawa Barat 40153").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(bsicaheum).title("Universitas BSI (Kampus Cicaheum)").snippet("Jalan Sekolah Internasional no.1-6 Antapani, Cicaheum, Kiaracondong, Cicaheum, Kiaracondong, Kota Bandung, Jawa Barat 40291").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(bsicikutra).title("Universitas BSI (Kampus Cikutra)").snippet("Cikutra, Cibeunying Kidul, Kota Bandung, Jawa Barat 40124").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(unibi).title("Universitas Informatika dan Bisnis Indonesia (UNIBI)").snippet("Jl Soekarno Hatta No.643, Sukapura, Kiaracondong, Sukapura, Kiaracondong, Kota Bandung, Jawa Barat 40614").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(advent).title("Universitas Advent Indonesia").snippet("Jl. Kolonel Masturi No.288, Cihanjuang Rahayu, Parongpong, Kabupaten Bandung Barat, Jawa Barat 40559").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));

        // Add Marker Sekolah Tinggi Swasta
        mMap.addMarker(new MarkerOptions().position(stekuitas).title("STIE Ekuitas").snippet("Jl. P.H.H. Mustofa No. 31, Neglasari, Cibeunying Kaler, Neglasari, Cibeunying Kaler, Kota Bandung, Jawa Barat 40124").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(stinaba).title("STIE Inaba").snippet("Jl. Soekarno Hatta No.448, Batununggal, Bandung Kidul, Kota Bandung, Jawa Barat 40266").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(stkridatama).title("STIE Kridatama").snippet("JL. Terusan Borobudur, No. 1-4, Bandung, Cibaduyut Kidul, Bojongloa Kidul, Bandung City, West Java 40238").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(ststanim).title("STIE STAN IM").snippet("Jl. Jakarta No.79, Kebonwaru, Batununggal, Kota Bandung, Jawa Barat 40272").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(ststembi).title("STIE Stembi").snippet("Jl. Buah Batu No. 26 RT03 RW07, Kel. Burangrang, Kec. Lengkong, Burangrang, Lengkong, Kota Bandung, Jawa Barat 40262").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(sttridharma).title("STIE Tridharma").snippet("Jl. Soekarno Hatta No.581, Binong, Batununggal, Kota Bandung, Jawa Barat 40275").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));

        mMap.addMarker(new MarkerOptions().position(stkippasundan).title("STKIP Pasundan").snippet("Jalan Permana No.32 B, Citeureup, Cimahi Utara, Citeureup, Cimahi Utara, Kota Cimahi, Jawa Barat 40512").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(stkippersis).title("STKIP PERSIS").snippet("JL. Pajagalan, No. 14-16, Bandung, Karang Anyar, Astanaanyar, Bandung City, West Java 40241").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(stkipsiliwangi).title("IKIP Siliwangi").snippet("Jl. Terusan Jend. Sudirman, Cibeber, Cimahi Sel., Kota Cimahi, Jawa Barat 40531").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));

        mMap.addMarker(new MarkerOptions().position(sttbdg).title("STT Bandung").snippet("Jl. Soekarno Hatta No.378, Kb. Lega, Bojongloa Kidul, Kota Bandung, Jawa Barat 40235").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(sttmandala).title("STT Mandala").snippet("Jl. Soekarno Hatta No.597, Kb. Kangkung, Kiaracondong, Kota Bandung, Jawa Barat 40284").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(sttnasional).title("STT Nasional").snippet("Jl. Tubagus Ismail Raya No.57, Sekeloa, Coblong, Kota Bandung, Jawa Barat 40134").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));

        mMap.addMarker(new MarkerOptions().position(stba).title("STBA YAPARI").snippet("Jalan Cihampelas No.194, Cipaganti, Coblong, Cipaganti, Coblong, Kota Bandung, Jawa Barat 40131").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(stdi).title("Sekolah Tinggi Desain Bandung").snippet("Jl. Wastukencana No.52, Tamansari, Bandung Wetan, Kota Bandung, Jawa Barat 40116").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(sthb).title("Sekolah Tinggi Hukum Bandung").snippet("Jl. Cihampelas No.8, Tamansari, Bandung Wetan, Kota Bandung, Jawa Barat 40116").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(stiabdg).title("Sekolah Tinggi Ilmu Administrasi Bandung").snippet("Jl. Muararajeun No.43, Cihaur Geulis, Cibeunying Kaler, Kota Bandung, Jawa Barat 40122").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(stiacmh).title("Sekolah Tinggi Ilmu Administrasi Cimahi").snippet("Jl. Raya Cibeber No.148, Kecamatan Cimahi, Selatan, Cimahi, Cibeber, Cimahi Sel., Bandung, Jawa Barat 40531").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(stikombdg).title("STIKOM Bandung").snippet("Jl. Soekarno Hatta No.3, Binong, Batununggal, Kota Bandung, Jawa Barat 40275").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(stmbtelkom).title("STMB Telkom Bandung").snippet("Jl. SetiaBudi No.156A, Ledeng, Cidadap, Kota Bandung, Jawa Barat 40143").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(stpertanianbale).title("Sekolah Tinggi Pertanian Bale Bandung").snippet("JL Wiranatakusumah, No. 7, Bale Endah, Baleendah, Bandung, Jawa Barat 40375").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));

        mMap.addMarker(new MarkerOptions().position(stikesrajawali).title("STIKES Rajawali").snippet("Jalan Rajawali Barat No.38, Maleber, Andir, Maleber, Andir, Kota Bandung, Jawa Barat 40184").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(stikesbk).title("STIKES Bhakti Kencana").snippet("Jalan Soekarno-Hatta No. 754, Cipadung Kidul, Panyileukan, Cipadung Kidul, Panyileukan, Cibiru Bandung, Jawa Barat 40614").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(stikesdharma).title("STIKES Dharma Husada").snippet("Jl. Terusan Jakarta No. 71 - 75, Cicaheum, Kiaracondong, Cicaheum, Kiaracondong, Antapani Bandung, Jawa Barat 40282").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(stikesimanuel).title("STIKES Immanuel").snippet("Jl. Raya Kopo No.161, Situsaeur, Bojongloa Kidul, Kota Bandung, Jawa Barat 40232").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(stikesahmadyani).title("STIKES Jend Ahmad Yani").snippet("Jl. Terusan Jenderal Sudirman, Baros, Cimahi, Kota Cimahi, Jawa Barat 40525").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(stikesboromeus).title("STIKES Santo Borromeus").snippet("Jalan Parahyangan Kavling 8 Blok B No.1, Kota Baru Parahyangan, Cipeundeuy, Padalarang, Cipeundeuy, Padalarang, Kabupaten Bandung").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(stikesaisyiyah).title("STIKES Aisyiyah").snippet("Jalan KH. Ahmad Dahlan Dalam No.6, Turangga, Lengkong, Turangga, Lengkong, Kota Bandung, Jawa Barat 40264").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));

        // Add Marker Akademi Swasta
        mMap.addMarker(new MarkerOptions().position(akakuntansi).title("Akademi Akuntansi Bandung").snippet("Jl. Merdeka No.33, Babakan Ciamis, Sumur Bandung, Kota Bandung, Jawa Barat 40117").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(akbasing).title("Akademi Bahasa Asing Internasional").snippet("Jalan Soekarno Hatta No.22, Cibuntu, Bandung Kulon, Cibuntu, Bandung Kulon, Kota Bandung, Jawa Barat 40211").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(akbidtridharma).title("Akademi Kebidanan Tri Dharma Bandung").snippet("Jl. Gadobangkong No.167C, Cimareme, Ngamprah, Kabupaten Bandung Barat, Jawa Barat 40552").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(akperbk).title("Akademi Keperawatan Bhakti Kencana").snippet("JL AH Nasution, No. 349, Jl. Raya Ujungberung - Cigending, Pasanggrahan, Ujung Berung, Kota Bandung, Jawa Barat 40614").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(akperkebon).title("Akademi Keperawatan Kebonjati").snippet("Jl. Kawaluyaan No.70, Sukapura, Kiaracondong, Kota Bandung, Jawa Barat 40286").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(akparnasional).title("Akademi Pariwisata Nasional Indonesia").snippet("Jl. R.A.A Martanegara No. 60 Gumuruh Batununggal Bandung Jawa Barat, Turangga, Lengkong, Kota Bandung, Jawa Barat 40264").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(akparnhi).title("Akademi Pariwisata NHI Bandung").snippet("Jalan Cemara No.20, Pasteur, Sukajadi, Pasteur, Sukajadi, Kota Bandung, Jawa Barat 40161").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(akparsandhy).title("Akademi Pariwisata Sandhy Putra").snippet("Jl. Windu No.19, Lkr. Sel., Lengkong, Kota Bandung, Jawa Barat 40263").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(akperinforkes).title("Akademi Perekaman Medis dan Informatika Kesehatan Bandung").snippet("Jl. Muararajeun, Cihaur Geulis, Cibeunying Kaler, Kota Bandung, Jawa Barat 40122").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(ariyanti).title("Akademi Sekretari dan Manajemen Ariyanti").snippet("Jalan Pasirkaliki No.127-129-131, Pamoyanan, Cicendo, Pamoyanan, Cicendo, Kota Bandung, Jawa Barat 40173").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(tarunabakti).title("Akademi Sekretari dan Manajemen Taruna Bakti").snippet("Jl. R.E. Martadinata No.93-95, Citarum, Bandung Wetan, Kota Bandung, Jawa Barat 40115").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(aktataboga).title("Akademi Tata Boga Bandung").snippet("Jl. Raya Cinunuk No.186, Cinunuk, Cileunyi, Bandung, Jawa Barat 40624").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(akaero).title("Akademi Teknologi Aeronautika Siliwangi Bandung").snippet("Jl. Pajajaran No.120, Pajajaran, Cicendo, Kota Bandung, Jawa Barat 40173").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));
        mMap.addMarker(new MarkerOptions().position(amikhass).title("AMIK Hass Bandung").snippet("Jl. R.A.A Martanegara No. 60 Gumuruh Batununggal Bandung Jawa Barat, Turangga, Lengkong, Kota Bandung, Jawa Barat 40264").icon(BitmapDescriptorFactory.fromResource(R.drawable.ic_mortarboard_or)));


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bdg, 12));
    }
}
