package com.example.quotes_sayri_app.Home_Screen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.quotes_sayri_app.Controller.My_Rv_Adpter1;
import com.example.quotes_sayri_app.Model.Model_class;
import com.example.quotes_sayri_app.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Sayri extends AppCompatActivity {

    private RecyclerView rv_sayri;
    String[] name = {"Love", "Friendship", " Birthday ", "Attitude", "Alone", "Failure", " God ", "Power", "Experience", "Leadership", " Science ", "Sports",};
    String[] love;
    String[] birthday;
    String[] acititude;
    String[] Friend;
    String[] alone;
    String title;
    String[] failure;
    String[] god;
    String[] power;
    String[] experience;
    String[] leadership;
    String[] science;
    String[] sport;
    int[] swicth_img;

    List<Model_class> l2 = new ArrayList<>();
    private TextView title_text;
    private ImageView left_arrow;
    private TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayri);

        blinding();
        title = getIntent().getStringExtra("n1");
        title_text.setText(title);

        left_arrow.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                onBackPressed();

            }
        });
        Add_set_metod();
        title_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textToSpeech.speak(title_text.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
            }
        });




        textToSpeech =new

                TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener()

        {
            @Override
            public void onInit ( int i){

                // if No error is found then only it will run
                if (i != TextToSpeech.ERROR) {
                    // To Choose language of speech
                    textToSpeech.setLanguage(Locale.UK);
                }
            }
        });

    }


    private void blinding() {
        rv_sayri = findViewById(R.id.rv_sayri);
        title_text = findViewById(R.id.title_text);
        left_arrow = findViewById(R.id.left_arrow);

    }

    void Add_set_metod() {

        if (title.equals(name[0])) {
            int[] swicth_img = {
                    R.drawable.imge1,
                    R.drawable.image12,
                    R.drawable.image7,
                    R.drawable.imge4,
                    R.drawable.imge5,
                    R.drawable.image6,
                    R.drawable.image7,
                    R.drawable.image9,
                    R.drawable.imge1,
                    R.drawable.imag10,
                    R.drawable.img11,
                    R.drawable.imge1,
            };

            String[] love = {"“As he read, I fell in love the way you fall asleep: slowly, and then all at once.“"
                    , "“Loved you yesterday, love you still, always have, always will.“"
                    , "“I saw that you were perfect, and so I loved you. Then I saw that you were not perfect and I loved you even more“"
                    , "“I love you not only for what you are, but for what I am when I am with you“"
                    , "“Thinking of you keeps me awake. Dreaming of you keeps me asleep. Being with you keeps me alive.“"
                    , "“I need you like a heart needs a beat.“"
                    , "“If I know what love is, it is because of you“"
                    , "“I swear I couldn’t love you more than I do right now, and yet I know I will tomorrow.“"
                    , "“A man is already halfway in love with any woman who listens to him.“"
                    , "“You make me want to be a better man.“"
                    , "“To love is to burn, to be on fire.“"
                    , "“Pleasure of love lasts but a moment. Pain of love lasts a lifetime.“"
            };


            for (int i = 0; i < love.length; i++) {
                Model_class model_class = new Model_class(love[i], swicth_img[i]);
                l2.add(model_class);
                My_Rv_Adpter1 adpter = new My_Rv_Adpter1(Sayri.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

                rv_sayri.setLayoutManager(layoutManager);
                rv_sayri.setAdapter(adpter);
            }


        } else if (title.equals(name[1])) {

            int[] swicth_img = {
                    R.drawable.imge1,
                    R.drawable.image12,
                    R.drawable.image7,
                    R.drawable.imge4,
                    R.drawable.imge5,
                    R.drawable.image6,
                    R.drawable.image7,
                    R.drawable.image9,
                    R.drawable.imge1,
                    R.drawable.imag10,
                    R.drawable.img11,
                    R.drawable.imge1,
            };

            String[] Friend = {"“A friend is one who overlooks your broken fence and admires the flowers in your garden.“"
                    , "“A good friend is like a four-leaf clover: hard to find and lucky to have.“"
                    , "“There is nothing I would not do for those who are really my friends.“"
                    , "“True friendship comes when the silence between two people is comfortable.“"
                    , "“Friendship is the source of the greatest pleasures, and without friends even the most agreeable pursuits become tedious.“"
                    , "“You find out who your real friends are when you’re involved in a scandal.“"
                    , "“Friendship is a wildly underrated medication.“"
                    , "“A true friend is one who overlooks your failures and tolerates your success!“"
                    , "“Real friendship, like real poetry, is extremely rare — and precious as a pearl.“"
                    , "“There is nothing better than a friend, unless it is a friend with chocolate. “"
                    , "“Friendship is always a sweet responsibility, never an opportunity.“"
                    , "“Friendship is like money, easier made than kept.“"
            };


            for (int i = 0; i < Friend.length; i++) {
                Model_class model_class = new Model_class(Friend[i], swicth_img[i]);
                l2.add(model_class);
                My_Rv_Adpter1 adpter = new My_Rv_Adpter1(Sayri.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_sayri.setLayoutManager(layoutManager);
                rv_sayri.setAdapter(adpter);
            }

        } else if (title.equals(name[2])) {
            int[] swicth_img = {
                    R.drawable.imge1,
                    R.drawable.image12,
                    R.drawable.image7,
                    R.drawable.imge4,
                    R.drawable.imge5,
                    R.drawable.image6,
                    R.drawable.image7,
                    R.drawable.image9,
                    R.drawable.imge1,
                    R.drawable.imag10,
                    R.drawable.img11,
                    R.drawable.imge1,
            };

            String[] birthday = {
                    "“Hope all your birthday wishes come true!”",
                    "“It's your special day — get out there and celebrate!”",
                    "“Wishing you the biggest slice of happy today.”",
                    "“I hope your celebration gives you many happy memories!”",
                    "“Our age is merely the number of years the world has been enjoying us!”",
                    "“Forget the past; look forward to the future, for the best things are yet to come.”",
                    "“You’re older today than yesterday but younger than tomorrow, happy birthday!”",
                    "“Cheers on your birthday. One step closer to adult underpants.”",
                    "“Happy Birthday! You know, you don’t look that old. But then, you don’t look that young, either.”",
                    "“To quote Shakespeare: ‘Party thine ass off!’”",
//                    "“Happy birthday to someone who is forever young!”",
                    "“You look younger than ever! Happy birthday!”",
                    "“You were born, and the world became a better place.”",
//                    "“I am blessed to have a buddy like you. Happy birthday, dear friend. May your special day be loaded with happiness and love.”",
            };


            for (int i = 0; i < birthday.length; i++) {
                Model_class model_class = new Model_class(birthday[i], swicth_img[i]);
                l2.add(model_class);
                My_Rv_Adpter1 adpter = new My_Rv_Adpter1(Sayri.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_sayri.setLayoutManager(layoutManager);
                rv_sayri.setAdapter(adpter);
            }
        } else if (title.equals(name[3])) {
            int[] swicth_img = {
                    R.drawable.imge1,
                    R.drawable.image12,
                    R.drawable.image7,
                    R.drawable.imge4,
                    R.drawable.imge5,
                    R.drawable.image6,
                    R.drawable.image7,
                    R.drawable.image9,
                    R.drawable.imge1,
                    R.drawable.imag10,
                    R.drawable.img11,
                    R.drawable.imge1,
            };

            String[] acititude = {
                    "“Xcuse me, I found something under my shoes. Oh its your attitude.”",
                    "“When i was born..Devil said..?Oh Shit..!! Competition?”",
                    "“I enjoy when people show Attitude to me because it shows that they need an Attitude to impress me!”",
                    "“People say me bad, trust me i am the worst!!!”",
                    "“Smile in front of people who hate you Ur happiness kills them”",
                    "“Stop checking my status ! Go Get A Life :P”",
//                    "“Dont Copy My Style.”",
                    "“I am who I am, Your approval is not needed”",
//                    "“Style is a reflection of your attitude and your personality.”",
                    "“All things are ready if our mind be so.”",
                    "“Keep moving! Nothing new to read”",
                    "“My life,My rules My Attitude!!!”",
                    "“You create beauty with your attitude, your behaviours, and your actions. Its all up to you”",
                    "“Im sorry my fault. I forgot youre an Idiot.”",
            };


            for (int i = 0; i < acititude.length; i++) {
                Model_class model_class = new Model_class(acititude[i], swicth_img[i]);
                l2.add(model_class);
                My_Rv_Adpter1 adpter = new My_Rv_Adpter1(Sayri.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_sayri.setLayoutManager(layoutManager);
                rv_sayri.setAdapter(adpter);
            }
        } else if (title.equals(name[4])) {
            int[] swicth_img = {
                    R.drawable.imge1,
                    R.drawable.image12,
                    R.drawable.image7,
                    R.drawable.imge4,
                    R.drawable.imge5,
                    R.drawable.image6,
                    R.drawable.image7,
                    R.drawable.image9,
                    R.drawable.imge1,
                    R.drawable.imag10,
                    R.drawable.img11,
                    R.drawable.imge1,
            };

            String[] alone = {
                    "“The strong man is strongest when alone.”",
                    "“Fail I alone, in words and deeds? Why, all men strive and who succeeds?”",
                    "“Loneliness expresses the pain of being alone and solitude expresses the glory of being alone.”",
                    "“I think Alone in the Dark was too much an action creature movie than a horror creature movie.”",
                    "“Music is one of those things that make us feel a little less alone in the world.”",
                    "“I would rather be a beggar and single than a queen and married.”",
                    "“Blood alone moves the wheels of history.”",
                    "“To live alone is the fate of all great souls.”",
                    "“Life could be wonderful if people would leave you alone.\n”",
                    "“Marriage is good for those who are afraid to sleep alone at night.\n”",
//                    "“If you go long enough without a bath, even the fleas will leave you alone.\n”",
//                    "“I would rather be alone and a loud voice for action than be silent.\n”",
                    "“I want to be alone.”",
                    "“Every man must do two things alone he must do his own believing and his own dying.”",
            };


            for (int i = 0; i < alone.length; i++) {
                Model_class model_class = new Model_class(alone[i], swicth_img[i]);
                l2.add(model_class);
                My_Rv_Adpter1 adpter = new My_Rv_Adpter1(Sayri.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_sayri.setLayoutManager(layoutManager);
                rv_sayri.setAdapter(adpter);
            }

        } else if (title.equals(name[5])) {
            int[] swicth_img = {
                    R.drawable.imge1,
                    R.drawable.image12,
                    R.drawable.image7,
                    R.drawable.imge4,
                    R.drawable.imge5,
                    R.drawable.image6,
                    R.drawable.image7,
                    R.drawable.image9,
                    R.drawable.imge1,
                    R.drawable.imag10,
                    R.drawable.img11,
                    R.drawable.imge1,
            };


            String[] failure = {
                    "“Failure is only the opportunity to begin again more intelligently.”",
                    "“The only risk of failure is promotion.”",
                    "“All of old. Nothing else ever. Ever tried. Ever failed. No matter. Try again. Fail again. Fail better.”",
                    "“I am not discouraged, because every wrong attempt discarded is another step forward.”",
                    "“Success is 99 percent failure.”",
                    "“When you stand at the edge of the cliff, jump to fly, not to fall.”",
                    "“The most crippling failure disease is.....Excuses”",
                    "“Dont laugh at those who fail Laugh at those who dont try.”",
                    "“The only people who never fail are those who never try.”",
                    "“I am facing the most difficult thing of my life my own greatest failure.”",
                    "“There are no mistakes, save one: the failure to learn from a mistake.”",
                    "“Turn your scars into stars”",
//                    "“Who has never tasted what is bitter does not know what is sweet.”",
//                    "“Success is the ability to go from failure to failure without losing your enthusiasm.”",
            };


            for (int i = 0; i < failure.length; i++) {
                Model_class model_class = new Model_class(failure[i], swicth_img[i]);
                l2.add(model_class);
                My_Rv_Adpter1 adpter = new My_Rv_Adpter1(Sayri.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_sayri.setLayoutManager(layoutManager);
                rv_sayri.setAdapter(adpter);
            }
        } else if (title.equals(name[6])) {
            int[] swicth_img = {
                    R.drawable.imge1,
                    R.drawable.image12,
                    R.drawable.image7,
                    R.drawable.imge4,
                    R.drawable.imge5,
                    R.drawable.image6,
                    R.drawable.image7,
                    R.drawable.image9,
                    R.drawable.imge1,
                    R.drawable.imag10,
                    R.drawable.img11,
                    R.drawable.imge1,
            };

            String[] god = {
                    "“I hate you, God. I hate you as though you actually exist.”",
                    "“Every man for himself and God for us all.”",
//                    "“The Lord is my light and my salvation; whom shall I fear? The Lord is the strength of my life; of whom shall I be afraid?”",
//                    "“The dice of God are always loaded.”",
                    "“Thank god my wife is neither a Serb nor a Jew.”",
                    "“I am responsible only to God and history.”",
                    "“Bless yourself first before expecting God to bless you.”",
                    "“The darker the night, the brighter the stars, The deeper the grief, the closer is God!”",
                    "“If you want to make God laugh, tell him about your plans.”",
                    "“In ancient times cats were worshipped as gods; they have not forgotten this.”",
                    "“Take what you want, said God, take it-and pay for it.”",
                    "“God is cruel. Sometimes he makes you live.”",
                    "“A man with God is always in the majority.”",
                    "“The noblest motive is the public good.”",
            };


            for (int i = 0; i < god.length; i++) {
                Model_class model_class = new Model_class(god[i], swicth_img[i]);
                l2.add(model_class);
                My_Rv_Adpter1 adpter = new My_Rv_Adpter1(Sayri.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_sayri.setLayoutManager(layoutManager);
                rv_sayri.setAdapter(adpter);
            }
        } else if (title.equals(name[7])) {
            int[] swicth_img = {
                    R.drawable.imge1,
                    R.drawable.image12,
                    R.drawable.image7,
                    R.drawable.imge4,
                    R.drawable.imge5,
                    R.drawable.image6,
                    R.drawable.image7,
                    R.drawable.image9,
                    R.drawable.imge1,
                    R.drawable.imag10,
                    R.drawable.img11,
                    R.drawable.imge1,
            };

            String[] power = {
                    "“Words, without power, is mere philosophy.”",
                    "“What is evil?-Whatever springs from weakness. ”",
                    "“The past cannot be changed. The future is yet in your power. ”",
                    "“Next to the assumption of power is the responsibility of relinquishing it.”",
                    "“Power corrupts, and absolute power corrupts absolutely.”",
//                    "“I believe the root of all evil is abuse of power.”",
//                    "“The greatest power is not money power, but political power.”",
                    "“Do the thing and you will have the power. But they that do not the thing, had not the power.”",
                    "“You can get more with a kind word and a gun than you can with a kind word alone.”",
                    "“Power is always dangerous. Power attracts the worst and corrupts the best.”",
                    "“If you must break the law, do it to seize power: in all other cases observe it.”",
                    "“What I fear most is power with impunity. I fear abuse of power, and the power to abuse.”",
                    "“Power has only one duty - to secure the social welfare of the People.”",
                    "“Not believing in force is the same as not believing in gravitation.”",
            };


            for (int i = 0; i < power.length; i++) {
                Model_class model_class = new Model_class(power[i], swicth_img[i]);
                l2.add(model_class);
                My_Rv_Adpter1 adpter = new My_Rv_Adpter1(Sayri.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_sayri.setLayoutManager(layoutManager);
                rv_sayri.setAdapter(adpter);
            }
        } else if (title.equals(name[8])) {
            int[] swicth_img = {
                    R.drawable.imge1,
                    R.drawable.image12,
                    R.drawable.image7,
                    R.drawable.imge4,
                    R.drawable.imge5,
                    R.drawable.image6,
                    R.drawable.image7,
                    R.drawable.image9,
                    R.drawable.imge1,
                    R.drawable.imag10,
                    R.drawable.img11,
                    R.drawable.imge1,
            };

            String[] experience = {
                    "“I did not tell half of what I saw, for I knew I would not be believed.”",
                    "“Experience comprises illusions lost, rather than wisdom gained.”",
                    "“Learning teacheth more in one year than experience in twenty.”",
                    "“Sure, I've often been misrepresented - anyone frequently quoted has this experience.”",
                    "“I think the highest and lowest points are the important ones. Anything else is just...in between.”",
                    "“Experience is merely the name men gave to their mistakes.”",
                    "“If you want to run, run a mile. If you want to experience a different life, run a marathon.”",
                    "“Nothing is a waste of time if you use the experience wisely.”",
                    "“My ultimate aim is to make euthanasia a positive experience.”",
                    "“Skill is the unified force of experience, intellect and passion in their operation.”",
//                    "“Experience is a jewel, and it had need be so, for it is often purchased at an infinite rate.”",
//                    "“He who has been bitten by a snake fears a piece of string.”",
                    "“People never learn anything by being told they have to find out for themselves.”",
                    "“Experience is like a comb that life gives you when you are bald.”",
            };


            for (int i = 0; i < experience.length; i++) {
                Model_class model_class = new Model_class(experience[i], swicth_img[i]);
                l2.add(model_class);
                My_Rv_Adpter1 adpter = new My_Rv_Adpter1(Sayri.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_sayri.setLayoutManager(layoutManager);
                rv_sayri.setAdapter(adpter);
            }
        } else if (title.equals(name[9])) {
            int[] swicth_img = {
                    R.drawable.imge1,
                    R.drawable.image12,
                    R.drawable.image7,
                    R.drawable.imge4,
                    R.drawable.imge5,
                    R.drawable.image6,
                    R.drawable.image7,
                    R.drawable.image9,
                    R.drawable.imge1,
                    R.drawable.imag10,
                    R.drawable.img11,
                    R.drawable.imge1,
            };

            String[] leadership = {
                    "“Leadership is an opportunity to serve. It is not a trumpet call to self-importance.”",
                    "“Show me the leader and I will know his men. Show me the men and I will know their leader.”",
                    "“The man who follows a crowd will never be followed by a crowd.”",
                    "“Leadership is unlocking people's potential to become better.”",
                    "“When you accept a leadership role you take on extra responsibility for your actions toward others.”",
                    "“Good leadership consists of showing average people how to do the work of superior people.”",
                    "“A good leader takes a little more than his share of the blame, a little less than his share of the credit.”",
//                    "“Leadership is action, not position.”",
//                    "“Leadership demands that we make tough choices.”",
                    "“People ask the difference between a leader and a boss. The leader leads, and the boss drives.”",
                    "“The only safe ship in a storm is leadership.”",
                    "“Reason and judgment are the qualities of a leader.”",
                    "“Today a reader, tomorrow a leader.”",
                    "“The speed of the leader determines the rate of the pack.”",
            };


            for (int i = 0; i < leadership.length; i++) {
                Model_class model_class = new Model_class(leadership[i], swicth_img[i]);
                l2.add(model_class);
                My_Rv_Adpter1 adpter = new My_Rv_Adpter1(Sayri.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_sayri.setLayoutManager(layoutManager);
                rv_sayri.setAdapter(adpter);
            }
        } else if (title.equals(name[10])) {
            int[] swicth_img = {
                    R.drawable.imge1,
                    R.drawable.image12,
                    R.drawable.image7,
                    R.drawable.imge4,
                    R.drawable.imge5,
                    R.drawable.image6,
                    R.drawable.image7,
                    R.drawable.image9,
                    R.drawable.imge1,
                    R.drawable.imag10,
                    R.drawable.img11,
                    R.drawable.imge1,
            };

            String[] science = {
                    "“However, the word madda in modern Hebrew specifically means science.”",
                    "“The whole of science is nothing more than a refinement of everyday thinking.”",
                    "“No science is immune to the infection of politics and the corruption of power.”",
                    "“In science there is only physics; all the rest is stamp collecting.”",
                    "“It is harder to crack prejudice than an atom.”",
                    "“Science is the knowledge of consequences, and dependence of one fact upon another.”",
                    "“Facts are not science - as the dictionary is not literature.”",
                    "“Everywhere you look in science, the harder it becomes to understand the universe without God.”",
                    "“Man lives for science as well as bread.”",
                    "“Science is always wrong, it never solves a problem without creating ten more.”",
//                    "“There is a point at which methods devour themselves.”",
//                    "“I am dying with the help of too many physicians.”",
                    "“Science is what you know, philosophy is what you don't know.”",
                    "“Science is the systematic classification of experience.”",
            };


            for (int i = 0; i < science.length; i++) {
                Model_class model_class = new Model_class(science[i], swicth_img[i]);
                l2.add(model_class);
                My_Rv_Adpter1 adpter = new My_Rv_Adpter1(Sayri.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_sayri.setLayoutManager(layoutManager);
                rv_sayri.setAdapter(adpter);
            }
        } else if (title.equals(name[11])) {
            int[] swicth_img = {
                    R.drawable.imge1,
                    R.drawable.image12,
                    R.drawable.image7,
                    R.drawable.imge4,
                    R.drawable.imge5,
                    R.drawable.image6,
                    R.drawable.image7,
                    R.drawable.image9,
                    R.drawable.imge1,
                    R.drawable.imag10,
                    R.drawable.img11,
                    R.drawable.imge1,
            };

            String[] sport = {
                    "“Never let a win get to your head, or a loss to your heart.”",
                    "“You can't win unless you learn how to lose.”",
                    "“Sports are a microcosm of society.”",
                    "“When I did sports cartoons, I used to uh, go to fights.”",
                    "“I wanted to be a doctor in sports medicine; I was into sailing and all that sort of thing.”",
//                    "“Adversity causes some men to break; others to break records.”",
//                    "“A lifetime of training for just ten seconds.”",
                    "“Just play. Have fun. Enjoy the game.”",
                    "“Two things only the people anxiously desire, bread and the Circus games.”",
                    "“I have the impression that cycling is no longer a game but rather an employment… a job.”",
                    "“Right now, after having had back surgery, I am finally back to running again.”",
                    "“Dont let them drag you down by rumors just go with what you believe in.”",
                    "“The only way to prove that you're a good sport is to lose.”",
                    "“Don't play too much golf. Two rounds a day are plenty.”",
            };


            for (int i = 0; i < sport.length; i++) {
                Model_class model_class = new Model_class(sport[i], swicth_img[i]);
                l2.add(model_class);
                My_Rv_Adpter1 adpter = new My_Rv_Adpter1(Sayri.this, l2);
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
                rv_sayri.setLayoutManager(layoutManager);
                rv_sayri.setAdapter(adpter);
            }
        }


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.refesh_btn:
                Toast.makeText(this, "Refesh", Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting_btn:
                Toast.makeText(this, "setting", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}