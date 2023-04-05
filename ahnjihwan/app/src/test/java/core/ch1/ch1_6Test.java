package core.ch1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ch1_6Test {
    ch1_6 example;

    @BeforeEach
    void setUp() {
        example = new ch1_6();
    }

    @Test
    public void result() {
        assertThat(example.factorial(1000)).isEqualTo(
                "402387260077093773543702433923003985719374" +
                        "864210714632543799910429938512398629020592" +
                        "0442084869694048004799886101971960586316668" +
                        "7299480855890132382966994459099742450408707" +
                        "3759918823627727188732519779505950995276120" +
                        "8749754624970436014182780946464962910563938" +
                        "8743788648733711918104582578364784997701247" +
                        "6632889835955735432513185323958463075557409" +
                        "1142624174743493475534286465766116677973966" +
                        "6882029120737914385371958824980812686783837" +
                        "4559731746136085379534524221586593201928090" +
                        "8782973084313928444032812315586110369768013" +
                        "5730421616874760967587134831202547858932076" +
                        "7169132448426236131412508780208000261683151" +
                        "0273418279777047846358681701643650241536913" +
                        "9828126481021309276124489635992870511496497" +
                        "5419909342221566832572080821333186116811553" +
                        "6158365469840467089756029009505376164758477" +
                        "2842188967964624494516076535340819890138544" +
                        "2487984959953319101723355556602139450399736" +
                        "2807501378376153071277619268490343526252000" +
                        "1588853514733161170210396817592151090778801" +
                        "9393178114194545257223865541461062892187960" +
                        "2238389714760885062768629671466746975629112" +
                        "3408243920816015378088989396451826324367161" +
                        "6762179168909779911903754031274622289988005" +
                        "1954444142820121873617459926429565817466283" +
                        "0295557029902432415318161721046583203678690" +
                        "6117260158783520751516284225540265170483304" +
                        "2261439742869330616908979684825901254583271" +
                        "6822645806652676995865268227280707578139185" +
                        "8178889652208164348344825993266043367660176" +
                        "9996128318607883861502794659551311565520360" +
                        "9398818061213855860030143569452722420634463" +
                        "1797460594682573103790084024432438465657245" +
                        "0144028218852524709351906209290231364932734" +
                        "9756551395872055965422874977401141334696271" +
                        "5422845862377387538230483865688976461927383" +
                        "8149001407673104466402598994902222217659043" +
                        "3990188601856652648506179970235619389701786" +
                        "0040811889729918311021171229845901641921068" +
                        "8843871218556461249607987229085192968193723" +
                        "8864261483965738229112312502418664935314397" +
                        "0137428531926649875337218940694281434118520" +
                        "1580141233448280150513996942901534830776445" +
                        "6909907315243327828826986460278986432113908" +
                        "3506217095002597389863554277196742822248757" +
                        "5867657523442202075736305694988250879689281" +
                        "6275384886339690995982628095612145099487170" +
                        "1244516461260379029309120889086942028510640" +
                        "1821543994571568059418727489980942547421735" +
                        "8240106367740459574178516082923013535808184" +
                        "0096996372524230560855903700624271243416909" +
                        "0041536901059339838357779394109700277534720" +
                        "0000000000000000000000000000000000000000000" +
                        "0000000000000000000000000000000000000000000" +
                        "0000000000000000000000000000000000000000000" +
                        "0000000000000000000000000000000000000000000" +
                        "0000000000000000000000000000000000000000000" +
                        "000000000000000000000000000000000"
        );
    }
}