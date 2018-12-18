cd
mkdir lab0
mkdir lab0/caterpie2
mkdir lab0/caterpie2/mamoswine
mkdir lab0/caterpie2/skorupi
touch lab0/caterpie2/zigzagoon
touch lab0/caterpie2/dewott
mkdir lab0/caterpie2/dragonair
mkdir lab0/caterpie2/gothitelle
touch lab0/crobat7
touch lab0/fraxure1
mkdir lab0/slowpoke8
mkdir lab0/slowpoke8/licktitung
mkdir lab0/slowpoke8/dugtrio
mkdir lab0/slowpoke8/gigalith
mkdir lab0/slowpoke8/leafeon
mkdir lab0/slowpoke8/cubone
touch lab0/slowpoke8/cleffa
touch lab0/wartorle1
mkdir lab0/yanma5
touch lab0/yanma5/granbull
touch lab0/yanma5/staravia
mkdir lab0/yanma5/magneton
mkdir lab0/yanma5/sneasel
touch lab0/yanma5/shellder
touch lab0/yanma5/steelix
echo ‘Живет ForestGrassland’  > lab0/caterpie2/zigzagoon
echo ‘Способности Tail Whip’ > lab0/caterpie2/dewott
echo ‘Water Gun Water Sport Focus Energy Razor Shell Fury Cutter Water’ >> lab0/caterpie2/dewott
echo ‘Revenge Aqua Jet Encore Aqua Tail Retaliate Swords Dans Hydro’ >> lab0/caterpie2/dewott
echo ‘Pump’ >> lab0/caterpie2/dewott
echo ‘Живет Cave’ > lab0/crobat7
echo ‘Живет Cave’ > lab0/fraxure1
echo ‘Mountain’ > lab0/fraxure1
echo ‘Развитые способности Friend’ >> lab0/slowpoke8/cleffa
echo ‘Guard’ >> lab0/slowpoke8/cleffa
echo ‘способности Torrent Shell armor Rock’ >  lab0/wartorle1
echo ‘Head’ >> lab0/wartorle1
echo ‘тип диеты Carnivore’ >lab0/yanma5/granbull
echo ‘Способности Quick’> lab0/yanma5/staravia
echo ‘Attack Wing Attack Double Team endeavor whirwind aerial ace take’ >> lab0/yanma5/staravia
echo ‘Agility Brave Bird Final Gambit’ >> lab0/yanma5/staravia
echo ‘Способности Torrent Shell’> lab0/yanma5/shellder
echo ‘Armor Skill Link’ >> lab0/yanma5/shellder
echo ‘satck=6 sdef=7 spd=3’ lab0/yanma5/steelix

chmod -wx-wx-wx ./lab0/caterpie2
chmod 700 ./lab0/caterpie2/mamoswine
chmod u=wx g=rw o=x /lab0/caterpie2/skorupi
chmod 440 ./lab0/caterpie2/zigzagoon
chmod  400 ./lab0/caterpie2/dewott
chmod 750 ./lab0/caterpie2/dragonair
chmod r-x—x-wx ./lab0/caterpie2/gothitelle
chmod  644 ./lab0/crobat7
chmod  ---r--r-- ./lab0/fraxure1
chmod r-x-w-r-- ./lab0/slowpoke8
chmod 555  ./lab0/slowpoke8/lickitung
chmod rwxr---w- ./lab0/slowpoke8/dugtrio
chmod r-x-w-r-- ./lab0/slowpoke8/gigalith
chmod -wx-wx-wx ./lab0/slowpoke8/leafeon
chmod 750 ./lab0/slowpoke8/cubone
chmod 660 ./lab0/slowpoke8/cleffa
chmod rw-r----- ./lab0/wartortle1
chmod -wx-wxr-x ./lab0/yanma5
chmod ---r—r-- ./lab0/yanma5/granbull
chmod r-----r-- ./lab0/yanma5/staravia
chmod rwxr-x-w- ./lab0/yanma5/magneton
chmod 357./lab0/yanma5/sneasel
chmod ---rw----./lab0/yanma5/shellder
chmod r-------- ./lab0/yanma5/steelix

ln lab0/wartotle1 lab0/yanma5/shellderwattortle
cp lab0/fraxure1 lab0/caterpie2/dragonair
cp lab0/wartortle1 lab0/caterpie2/zigzagoonwartortle
ln –s Copy_2 lab0/yanma0 
cat lab0/slowpoke8/cleffa lab0/yanma5/steelix > lab0/crobat7_29
cp –r  lab0/slowpoke8 lab0/slowpoke8/cubone
ln –s lab0/wartortle1 lab0/caterpie2/zigzagoonwartortle

wc –l lab0/fraxure1 >> lab0/fraxure1
ls –ltr lab0/slowpoke8
(cat lab0/*n lab0/*/*n lab0/*/*/*n | sort) 2> /dev/null
(ls -ltp lab0/slowpoke8 | grep -v /) 2> /tmp
(ls -ltrRp lab0 | grep -v / | grep ‘ma’ | head -3) 2> /dev/null
wc -c lab0/*a lab0/*/*a lab0/*/*/*a > /tmp

rm lab0/fraxure1
rm lab0/caterpie2/dewott – Permission denied
rm lab0/yanma5/Copy*
rm lab0/yanma5/shellderwartort*
rmdir lab0/slowpoke8 – Directory not empty
rmdir lab0/slowpoke8/gigalith

