/*
 * 
 * Breathe2Relax
 * 
 * Copyright � 2009-2012 United States Government as represented by 
 * the Chief Information Officer of the National Center for Telehealth 
 * and Technology. All Rights Reserved.
 * 
 * Copyright � 2009-2012 Contributors. All Rights Reserved. 
 * 
 * THIS OPEN SOURCE AGREEMENT ("AGREEMENT") DEFINES THE RIGHTS OF USE, 
 * REPRODUCTION, DISTRIBUTION, MODIFICATION AND REDISTRIBUTION OF CERTAIN 
 * COMPUTER SOFTWARE ORIGINALLY RELEASED BY THE UNITED STATES GOVERNMENT 
 * AS REPRESENTED BY THE GOVERNMENT AGENCY LISTED BELOW ("GOVERNMENT AGENCY"). 
 * THE UNITED STATES GOVERNMENT, AS REPRESENTED BY GOVERNMENT AGENCY, IS AN 
 * INTENDED THIRD-PARTY BENEFICIARY OF ALL SUBSEQUENT DISTRIBUTIONS OR 
 * REDISTRIBUTIONS OF THE SUBJECT SOFTWARE. ANYONE WHO USES, REPRODUCES, 
 * DISTRIBUTES, MODIFIES OR REDISTRIBUTES THE SUBJECT SOFTWARE, AS DEFINED 
 * HEREIN, OR ANY PART THEREOF, IS, BY THAT ACTION, ACCEPTING IN FULL THE 
 * RESPONSIBILITIES AND OBLIGATIONS CONTAINED IN THIS AGREEMENT.
 * 
 * Government Agency: The National Center for Telehealth and Technology
 * Government Agency Original Software Designation: Breathe2Relax001
 * Government Agency Original Software Title: Breathe2Relax
 * User Registration Requested. Please send email 
 * with your contact information to: robert.kayl2@us.army.mil
 * Government Agency Point of Contact for Original Software: robert.kayl2@us.army.mil
 * 
 */

package org.t2health.breathe2relax;

public final class R {
    public static final class anim {
        public static final int appear=0x7f040000;
        public static final int b2r_animation_scale=0x7f040001;
        public static final int b2r_animation_scale_out=0x7f040002;
        public static final int b2r_animation_translate=0x7f040003;
        public static final int b2r_move_down=0x7f040004;
        public static final int b2r_move_up=0x7f040005;
        public static final int b2r_scale_exhale_inhale=0x7f040006;
        public static final int b2r_scale_inhale_exhale=0x7f040007;
        public static final int disappear=0x7f040008;
    }
    public static final class array {
        public static final int breathe_cycles=0x7f0b0002;
        public static final int pattern_names=0x7f0b0001;
        public static final int pattern_prefix=0x7f0b0000;
    }
    public static final class attr {
        /** <p>Must be one or more (separated by '|') of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>left</code></td><td>0</td><td></td></tr>
<tr><td><code>top</code></td><td>1</td><td></td></tr>
<tr><td><code>right</code></td><td>2</td><td></td></tr>
<tr><td><code>bottom</code></td><td>3</td><td></td></tr>
</table>
         */
        public static final int imagePosition=0x7f010004;
        /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int layout_x=0x7f010000;
        /** <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int layout_y=0x7f010001;
        /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int navigationHeaderBgColor=0x7f010007;
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int navigationHeaderTextAppearance=0x7f010005;
        /** <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int navigationHeaderTextColor=0x7f010006;
        /** <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
         */
        public static final int src=0x7f010003;
        /** <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
         */
        public static final int text=0x7f010002;
    }
    public static final class color {
        public static final int blue=0x7f0a0003;
        public static final int chart_gradient_center=0x7f0a0005;
        public static final int chart_gradient_end=0x7f0a0006;
        public static final int chart_gradient_start=0x7f0a0004;
        public static final int chart_text=0x7f0a0007;
        public static final int green=0x7f0a0002;
        public static final int red=0x7f0a0001;
        public static final int white=0x7f0a0000;
    }
    public static final class drawable {
        public static final int b2r_animation_beaches=0x7f020000;
        public static final int b2r_animation_cosmicphotos=0x7f020001;
        public static final int b2r_animation_flowers=0x7f020002;
        public static final int b2r_animation_mountainmeadows=0x7f020003;
        public static final int b2r_animation_rainforests=0x7f020004;
        public static final int b2r_animation_sunsets=0x7f020005;
        public static final int b2r_animation_white=0x7f020006;
        public static final int b2r_custom_corners=0x7f020007;
        public static final int b2r_layerlist=0x7f020008;
        public static final int b2r_layerlist_top=0x7f020009;
        public static final int b2r_layout_background=0x7f02000a;
        public static final int b2rlogo=0x7f02000b;
        public static final int beach1=0x7f02000c;
        public static final int beach10=0x7f02000d;
        public static final int beach11=0x7f02000e;
        public static final int beach12=0x7f02000f;
        public static final int beach2=0x7f020010;
        public static final int beach3=0x7f020011;
        public static final int beach4=0x7f020012;
        public static final int beach5=0x7f020013;
        public static final int beach6=0x7f020014;
        public static final int beach7=0x7f020015;
        public static final int beach8=0x7f020016;
        public static final int beach9=0x7f020017;
        public static final int beachthumb=0x7f020018;
        public static final int blackbottomfade=0x7f020019;
        public static final int blacktopfade=0x7f02001a;
        public static final int blue_body_metronome=0x7f02001b;
        public static final int blue_bottom_metronome=0x7f02001c;
        public static final int blue_top_metronome=0x7f02001d;
        public static final int bodylogo=0x7f02001e;
        public static final int box=0x7f02001f;
        public static final int btn_back_idle=0x7f020020;
        public static final int btn_back_over=0x7f020021;
        public static final int btn_expand_video=0x7f020022;
        public static final int btn_fastforward=0x7f020023;
        public static final int btn_fastforward_idle=0x7f020024;
        public static final int btn_fastforward_over=0x7f020025;
        public static final int btn_minimize_video=0x7f020026;
        public static final int btn_pause=0x7f020027;
        public static final int btn_pause_idle=0x7f020028;
        public static final int btn_pause_over=0x7f020029;
        public static final int btn_play=0x7f02002a;
        public static final int btn_play_idle=0x7f02002b;
        public static final int btn_play_over=0x7f02002c;
        public static final int btn_rewind=0x7f02002d;
        public static final int btn_rewind_idle=0x7f02002e;
        public static final int btn_rewind_over=0x7f02002f;
        public static final int button_brain=0x7f020030;
        public static final int button_close=0x7f020031;
        public static final int button_ears=0x7f020032;
        public static final int button_eyes=0x7f020033;
        public static final int button_fingers=0x7f020034;
        public static final int button_glow=0x7f020035;
        public static final int button_glow2=0x7f020036;
        public static final int button_heart=0x7f020037;
        public static final int button_immune=0x7f020038;
        public static final int button_lungs=0x7f020039;
        public static final int button_muscles=0x7f02003a;
        public static final int button_outerglow=0x7f02003b;
        public static final int button_skin=0x7f02003c;
        public static final int button_stomach=0x7f02003d;
        public static final int chart_background=0x7f02003e;
        public static final int checkbox=0x7f02003f;
        public static final int checkboxchecked=0x7f020040;
        public static final int checkboxpressed=0x7f020041;
        public static final int contrast=0x7f020042;
        public static final int cosmos1=0x7f020043;
        public static final int cosmos10=0x7f020044;
        public static final int cosmos11=0x7f020045;
        public static final int cosmos12=0x7f020046;
        public static final int cosmos13=0x7f020047;
        public static final int cosmos14=0x7f020048;
        public static final int cosmos2=0x7f020049;
        public static final int cosmos3=0x7f02004a;
        public static final int cosmos4=0x7f02004b;
        public static final int cosmos5=0x7f02004c;
        public static final int cosmos6=0x7f02004d;
        public static final int cosmos7=0x7f02004e;
        public static final int cosmos8=0x7f02004f;
        public static final int cosmos9=0x7f020050;
        public static final int cosmosthumb=0x7f020051;
        public static final int cosmosthumb1=0x7f020052;
        public static final int flower1=0x7f020053;
        public static final int flower10=0x7f020054;
        public static final int flower11=0x7f020055;
        public static final int flower12=0x7f020056;
        public static final int flower2=0x7f020057;
        public static final int flower3=0x7f020058;
        public static final int flower4=0x7f020059;
        public static final int flower5=0x7f02005a;
        public static final int flower6=0x7f02005b;
        public static final int flower7=0x7f02005c;
        public static final int flower8=0x7f02005d;
        public static final int flower9=0x7f02005e;
        public static final int flowerthumb=0x7f02005f;
        public static final int glass_green=0x7f020060;
        public static final int ibreathe_body=0x7f020061;
        public static final int ibreathe_body_clip=0x7f020062;
        public static final int ibreathe_body_immunesystem=0x7f020063;
        public static final int ibreathe_body_scan0=0x7f020064;
        public static final int ibreathe_body_scan1=0x7f020065;
        public static final int ibreathe_body_scan2=0x7f020066;
        public static final int ibreathe_body_scan3=0x7f020067;
        public static final int ibreathe_body_scan4=0x7f020068;
        public static final int ibreathe_body_scan5=0x7f020069;
        public static final int ibreathe_brain=0x7f02006a;
        public static final int ibreathe_circulatory=0x7f02006b;
        public static final int ibreathe_ears=0x7f02006c;
        public static final int ibreathe_eyes=0x7f02006d;
        public static final int ibreathe_fingers=0x7f02006e;
        public static final int ibreathe_lungs=0x7f02006f;
        public static final int ibreathe_muscles=0x7f020070;
        public static final int ibreathe_skin=0x7f020071;
        public static final int ibreathe_stomach=0x7f020072;
        public static final int icon=0x7f020073;
        public static final int img_playback_bg=0x7f020074;
        public static final int img_playback_bg_lt_endcap=0x7f020075;
        public static final int img_playback_bg_px_tile=0x7f020076;
        public static final int img_playback_bg_rt_endcap=0x7f020077;
        public static final int img_playback_line=0x7f020078;
        public static final int img_scrubber_bg_lt_endcap=0x7f020079;
        public static final int img_scrubber_bg_px_tile=0x7f02007a;
        public static final int img_scrubber_bg_rt_endcap=0x7f02007b;
        public static final int img_scrubber_buffer=0x7f02007c;
        public static final int img_scrubber_buffer_lt_endcap=0x7f02007d;
        public static final int img_scrubber_buffer_px_tile=0x7f02007e;
        public static final int img_scrubber_buffer_rt_endcap=0x7f02007f;
        public static final int img_scrubber_bufferglow_wide=0x7f020080;
        public static final int img_scrubber_dot=0x7f020081;
        public static final int img_scrubber_fill_lt_endcap=0x7f020082;
        public static final int img_scrubber_fill_px_tile=0x7f020083;
        public static final int img_scrubber_fill_rt_endcap=0x7f020084;
        public static final int img_scrubber_timer=0x7f020085;
        public static final int img_scrubber_whiteglow=0x7f020086;
        public static final int img_scrubber_whiteglow_wide=0x7f020087;
        public static final int img_topbar_px_tile=0x7f020088;
        public static final int insideexhale=0x7f020089;
        public static final int insideinhale=0x7f02008a;
        public static final int laser_line_animation=0x7f02008b;
        public static final int less=0x7f02008c;
        public static final int meadow1=0x7f02008d;
        public static final int meadow10=0x7f02008e;
        public static final int meadow11=0x7f02008f;
        public static final int meadow12=0x7f020090;
        public static final int meadow13=0x7f020091;
        public static final int meadow2=0x7f020092;
        public static final int meadow3=0x7f020093;
        public static final int meadow4=0x7f020094;
        public static final int meadow5=0x7f020095;
        public static final int meadow6=0x7f020096;
        public static final int meadow7=0x7f020097;
        public static final int meadow8=0x7f020098;
        public static final int meadow9=0x7f020099;
        public static final int meadowthumb=0x7f02009a;
        public static final int more=0x7f02009b;
        public static final int outside=0x7f02009c;
        public static final int play=0x7f02009d;
        public static final int progress_bar_horizontal=0x7f02009e;
        public static final int rainforest1=0x7f02009f;
        public static final int rainforest2=0x7f0200a0;
        public static final int rainforest3=0x7f0200a1;
        public static final int rainforest4=0x7f0200a2;
        public static final int rainforest5=0x7f0200a3;
        public static final int rainforest6=0x7f0200a4;
        public static final int rainforest7=0x7f0200a5;
        public static final int rainforest8=0x7f0200a6;
        public static final int rainforestthumb=0x7f0200a7;
        public static final int scenery_beach_1=0x7f0200a8;
        public static final int scenery_beach_10=0x7f0200a9;
        public static final int scenery_beach_11=0x7f0200aa;
        public static final int scenery_beach_12=0x7f0200ab;
        public static final int scenery_beach_2=0x7f0200ac;
        public static final int scenery_beach_3=0x7f0200ad;
        public static final int scenery_beach_4=0x7f0200ae;
        public static final int scenery_beach_5=0x7f0200af;
        public static final int scenery_beach_6=0x7f0200b0;
        public static final int scenery_beach_7=0x7f0200b1;
        public static final int scenery_beach_8=0x7f0200b2;
        public static final int scenery_beach_9=0x7f0200b3;
        public static final int scrubber=0x7f0200b4;
        public static final int seek_thumb=0x7f0200b5;
        public static final int seek_thumb_normal=0x7f0200b6;
        public static final int seek_thumb_normal_focused=0x7f0200b7;
        public static final int seek_thumb_normal_gray=0x7f0200b8;
        public static final int seek_thumb_normal_pressed=0x7f0200b9;
        public static final int seek_thumb_normal_selected=0x7f0200ba;
        public static final int sunset1=0x7f0200bb;
        public static final int sunset10=0x7f0200bc;
        public static final int sunset11=0x7f0200bd;
        public static final int sunset12=0x7f0200be;
        public static final int sunset13=0x7f0200bf;
        public static final int sunset14=0x7f0200c0;
        public static final int sunset15=0x7f0200c1;
        public static final int sunset16=0x7f0200c2;
        public static final int sunset17=0x7f0200c3;
        public static final int sunset18=0x7f0200c4;
        public static final int sunset2=0x7f0200c5;
        public static final int sunset3=0x7f0200c6;
        public static final int sunset4=0x7f0200c7;
        public static final int sunset5=0x7f0200c8;
        public static final int sunset6=0x7f0200c9;
        public static final int sunset7=0x7f0200ca;
        public static final int sunset8=0x7f0200cb;
        public static final int sunset9=0x7f0200cc;
        public static final int sunsetthumb=0x7f0200cd;
        public static final int t2_base_navigation_title_bg_overlay=0x7f0200ce;
        public static final int t2_logo_small=0x7f0200cf;
        public static final int t2logo=0x7f0200d0;
        public static final int tick=0x7f0200d1;
        public static final int tick_small=0x7f0200d2;
        public static final int title_background=0x7f0200d3;
        public static final int white_down_arrow=0x7f0200d4;
        public static final int white_rounded_box=0x7f0200d5;
    }
    public static final class id {
        public static final int ButtonBrain=0x7f07000a;
        public static final int ButtonEars=0x7f070014;
        public static final int ButtonEyes=0x7f07000f;
        public static final int ButtonFingers=0x7f070032;
        public static final int ButtonHeart=0x7f070028;
        public static final int ButtonImmune=0x7f070019;
        public static final int ButtonLungs=0x7f070023;
        public static final int ButtonMuscles=0x7f07001e;
        public static final int ButtonSkin=0x7f070037;
        public static final int ButtonStomach=0x7f07002d;
        public static final int ChooseVisualSettingsListView=0x7f07004b;
        public static final int FrameLayoutFrameForWeb=0x7f070046;
        public static final int LinearLayoutEars=0x7f070010;
        public static final int LinearLayoutEyes=0x7f07000b;
        public static final int LinearLayoutFingers=0x7f07002e;
        public static final int LinearLayoutHeart=0x7f070024;
        public static final int LinearLayoutImmune=0x7f070015;
        public static final int LinearLayoutLungs=0x7f07001f;
        public static final int LinearLayoutMuscles=0x7f07001a;
        public static final int LinearLayoutSkin=0x7f070033;
        public static final int LinearLayoutStomach=0x7f070029;
        public static final int answer1=0x7f0700cf;
        public static final int answer2=0x7f0700d1;
        public static final int backgroundReRun=0x7f07008d;
        public static final int backgroundStartBreathing=0x7f070095;
        public static final int backgroundmusiclistview=0x7f0700dc;
        public static final int basefadingview=0x7f07003a;
        public static final int bodyfadingview=0x7f07003b;
        public static final int bodyview=0x7f070039;
        public static final int bottom=0x7f070003;
        public static final int breathCountProgressBar=0x7f0700a3;
        public static final int button1=0x7f0700b2;
        public static final int button2=0x7f0700b3;
        public static final int button3=0x7f0700b4;
        public static final int buttonBodysReactionToStress=0x7f07006a;
        public static final int buttonCancelExhale=0x7f070078;
        public static final int buttonCancelInhale=0x7f07007b;
        public static final int buttonChooseMusicFirstLaunch=0x7f070053;
        public static final int buttonChooseVisualFirstLaunch=0x7f070052;
        public static final int buttonCloseThisDialog=0x7f070049;
        public static final int buttonDiaphragmaticBreathing=0x7f0700bb;
        public static final int buttonEffectsOfStressOnTheBody=0x7f0700bd;
        public static final int buttonFinished=0x7f07008f;
        public static final int buttonFirstLaunchShowMeHowFirstLaunch=0x7f070056;
        public static final int buttonHowToBreath=0x7f070066;
        public static final int buttonIamReadyExhale=0x7f070077;
        public static final int buttonIamReadyInhale=0x7f07007a;
        public static final int buttonMenuAbout=0x7f070109;
        public static final int buttonMenuBreathe=0x7f0700c7;
        public static final int buttonMenuHelp=0x7f0700ca;
        public static final int buttonMenuSettings=0x7f070108;
        public static final int buttonMenuTrack=0x7f0700c9;
        public static final int buttonNextPostRateYourStress=0x7f070086;
        public static final int buttonNextPreRateYourStress=0x7f07008a;
        public static final int buttonPressHereExhale=0x7f0700e4;
        public static final int buttonPressHereInhale=0x7f0700ea;
        public static final int buttonPressRetryExhale=0x7f070071;
        public static final int buttonPressRetryInhale=0x7f070075;
        public static final int buttonPressSaveExhale=0x7f070070;
        public static final int buttonPressSaveInhale=0x7f070074;
        public static final int buttonProceed=0x7f070065;
        public static final int buttonReadBiologyOfStress=0x7f0700b9;
        public static final int buttonReadReadResults=0x7f0700bf;
        public static final int buttonReadWatchResults=0x7f0700c0;
        public static final int buttonRerun=0x7f07008e;
        public static final int buttonRestart=0x7f070062;
        public static final int buttonSetExhalePreferencesFirstLaunch=0x7f070055;
        public static final int buttonSetInhalePreferencesFirstLaunch=0x7f070054;
        public static final int buttonShowMeHow=0x7f0700c8;
        public static final int buttonShowMeHowOnYoutubeOff=0x7f07010f;
        public static final int buttonShowMeHowOnYoutubeOn=0x7f07010e;
        public static final int buttonSkipPostRateYourStress=0x7f070084;
        public static final int buttonSkipPreRateYourStress=0x7f070088;
        public static final int buttonStartBreathingSession=0x7f070096;
        public static final int buttonTipLayout=0x7f0700f7;
        public static final int buttonTrackClear=0x7f07010c;
        public static final int buttonTrackGenerate=0x7f07010b;
        public static final int buttonTrackMenuAbout=0x7f07010a;
        public static final int buttonTrackRedo=0x7f07010d;
        public static final int buttonWatchBiologyOfBreathing=0x7f070068;
        public static final int buttonWatchReadResults=0x7f07006c;
        public static final int buttonWatchWatchResults=0x7f07006d;
        public static final int buttoninformationclose=0x7f070050;
        public static final int buttoninformationnotagain=0x7f07004f;
        public static final int buttonpreviewselectionID=0x7f0700db;
        public static final int buttonuseselectionID=0x7f0700da;
        public static final int chart=0x7f0700f9;
        public static final int chartLabels=0x7f0700f8;
        public static final int decreaseExhaleButtonB2R=0x7f070061;
        public static final int detailsButton=0x7f0700ef;
        public static final int emptyListView=0x7f0700f0;
        public static final int emptyText=0x7f0700c2;
        public static final int ffwd=0x7f07009f;
        public static final int footerBackgroundMusic=0x7f070094;
        public static final int forgotPasswordButton=0x7f0700d3;
        public static final int frameLayout1=0x7f070008;
        public static final int frameLayout10=0x7f070030;
        public static final int frameLayout11=0x7f070035;
        public static final int frameLayout2=0x7f07000d;
        public static final int frameLayout3=0x7f070012;
        public static final int frameLayout5=0x7f070017;
        public static final int frameLayout6=0x7f07001c;
        public static final int frameLayout7=0x7f070021;
        public static final int frameLayout8=0x7f070026;
        public static final int frameLayout9=0x7f07002b;
        public static final int frameLayout9Box=0x7f070057;
        public static final int frameLayoutBodyScanner=0x7f070005;
        public static final int frameLayoutImageLayers=0x7f070038;
        public static final int headerBackgroundMusic=0x7f070093;
        public static final int icon=0x7f070091;
        public static final int imageAnimationForB2R=0x7f0700a5;
        public static final int imageBlueBottomInhaleExhaleForB2R=0x7f07005a;
        public static final int imageBlueHeadInhaleExhaleForB2R=0x7f07005c;
        public static final int imageBlueInhaleExhaleForB2R=0x7f07005b;
        public static final int imageView1=0x7f0700b0;
        public static final int imageViewBottom=0x7f07004a;
        public static final int imageViewButtonGlowBrain=0x7f070009;
        public static final int imageViewButtonGlowEars=0x7f070013;
        public static final int imageViewButtonGlowEyes=0x7f07000e;
        public static final int imageViewButtonGlowFingers=0x7f070031;
        public static final int imageViewButtonGlowHeart=0x7f070027;
        public static final int imageViewButtonGlowImmune=0x7f070018;
        public static final int imageViewButtonGlowLungs=0x7f070022;
        public static final int imageViewButtonGlowMuscles=0x7f07001d;
        public static final int imageViewButtonGlowSkin=0x7f070036;
        public static final int imageViewButtonGlowStomach=0x7f07002c;
        public static final int imageViewLaserLine=0x7f07003d;
        public static final int imageViewLogo=0x7f0700c5;
        public static final int imageViewTop=0x7f070048;
        public static final int imageWhiteForB2R=0x7f07005d;
        public static final int imageviewInhale=0x7f070059;
        public static final int increaseExhaleButtonB2R=0x7f070064;
        public static final int inputsContainer=0x7f0700cc;
        public static final int layoutGridItems=0x7f07004c;
        public static final int left=0x7f070000;
        public static final int linearLayout1=0x7f0700a6;
        public static final int linearLayout2=0x7f0700a9;
        public static final int linearLayout3=0x7f0700ac;
        public static final int linearLayout4=0x7f070058;
        public static final int linearLayout5=0x7f0700a7;
        public static final int linearLayoutBrain=0x7f070006;
        public static final int linearLayoutButtons=0x7f07003f;
        public static final int linearLayoutImage=0x7f0700c4;
        public static final int linearLayoutImmune=0x7f070042;
        public static final int linearLayoutRow1=0x7f070040;
        public static final int linearLayoutRow2=0x7f070041;
        public static final int linearLayoutRow3=0x7f070043;
        public static final int linearLayoutRow4=0x7f070044;
        public static final int linearLayoutRow5=0x7f070045;
        public static final int linearlayoutMain_B2R=0x7f0700c3;
        public static final int linearlayoutSettings_B2R=0x7f070051;
        public static final int linearlayoutStartBreathingText=0x7f0700f4;
        public static final int linearlayoutStartBreathingWidget=0x7f0700f5;
        public static final int list=0x7f0700c1;
        public static final int listHeader=0x7f0700eb;
        public static final int listviewGridItems=0x7f07004d;
        public static final int main_main_main_Exhale=0x7f0700e1;
        public static final int main_main_main_Inhale=0x7f0700e7;
        public static final int maskview=0x7f07003e;
        public static final int maxLabel=0x7f070082;
        public static final int mediacontroller_progress=0x7f0700a1;
        public static final int minLabel=0x7f070081;
        public static final int monthMinusButton=0x7f0700fa;
        public static final int monthName=0x7f0700fb;
        public static final int monthPlusButton=0x7f0700fc;
        public static final int navigationContent=0x7f07009c;
        public static final int navigationGestureOverlay=0x7f070097;
        public static final int navigationLeftButton=0x7f070099;
        public static final int navigationRightButton=0x7f07009b;
        public static final int navigationTitle=0x7f07009a;
        public static final int navigationTitleWrapper=0x7f070098;
        public static final int negativeArrow=0x7f070107;
        public static final int negativeButton=0x7f070103;
        public static final int neutralArrow=0x7f070106;
        public static final int neutralButton=0x7f070102;
        public static final int nextButton=0x7f0700f2;
        public static final int passwordEditText=0x7f0700cd;
        public static final int pause=0x7f07009e;
        public static final int pauseExhaleButtonB2R=0x7f070063;
        public static final int player=0x7f070004;
        public static final int portviewoverlay=0x7f07003c;
        public static final int positiveArrow=0x7f070105;
        public static final int positiveButton=0x7f070101;
        public static final int post_exhale_length_text_view=0x7f07006e;
        public static final int post_inhale_length_text_view=0x7f070072;
        public static final int previousButton=0x7f070104;
        public static final int question1=0x7f0700ce;
        public static final int question2=0x7f0700d0;
        public static final int radioButtonPostRateStress=0x7f070085;
        public static final int radioButtonPreRateStress=0x7f070089;
        public static final int ratestressafterBreathing=0x7f07007c;
        public static final int ratestressbeforeBreathing=0x7f070087;
        public static final int readwatchswitcher=0x7f07008c;
        public static final int remainingSecondsExhale=0x7f0700a4;
        public static final int rew=0x7f07009d;
        public static final int right=0x7f070002;
        public static final int rowLayoutB2R=0x7f070090;
        public static final int score_wrapper=0x7f0700ed;
        public static final int securityEnabled=0x7f0700cb;
        public static final int seekBar1=0x7f0700b1;
        public static final int seekBarInTarget=0x7f0700ab;
        public static final int seekBarOutTarget=0x7f0700ae;
        public static final int selectedbackgroundmusictext=0x7f0700de;
        public static final int selectedbackgroundmusictitle=0x7f0700dd;
        public static final int set_exhale_length_text_view=0x7f0700df;
        public static final int set_inhale_length_text_view=0x7f0700e5;
        public static final int settingsCancel=0x7f0700b5;
        public static final int settingsSave=0x7f0700b6;
        public static final int slideBar=0x7f070080;
        public static final int sliderBarWidget=0x7f07007f;
        public static final int startButton=0x7f0700f1;
        public static final int t2Logo=0x7f0700f3;
        public static final int t2LogoMainView=0x7f0700c6;
        public static final int t2healthbreathe2relaxBreathView=0x7f0700af;
        public static final int tab1=0x7f0700b7;
        public static final int tab2=0x7f0700b8;
        public static final int testBottomRelativeLayout=0x7f070083;
        public static final int testTopRelativeLayout=0x7f07007d;
        public static final int testTopTextView=0x7f07007e;
        public static final int text1=0x7f0700ec;
        public static final int text2=0x7f070100;
        public static final int textBiologyOfStress=0x7f0700ba;
        public static final int textBodysReactionToStress=0x7f07006b;
        public static final int textBreathLength=0x7f07005f;
        public static final int textCurrentMeasureExhale=0x7f0700e3;
        public static final int textCurrentMeasureInhale=0x7f0700e9;
        public static final int textCyclesAnimationB2R=0x7f070060;
        public static final int textDiaphragmaticBreathing=0x7f0700bc;
        public static final int textEffectsOfStressOnTheBody=0x7f0700be;
        public static final int textHowToBreath=0x7f070067;
        public static final int textOneAnimationB2R=0x7f07005e;
        public static final int textPreviousMeasureExhale=0x7f0700e0;
        public static final int textPreviousMeasureInhale=0x7f0700e6;
        public static final int textResultOfExhale=0x7f07006f;
        public static final int textResultOfInhale=0x7f070073;
        public static final int textResultOfPostExhale=0x7f070076;
        public static final int textResultOfPostInhale=0x7f070079;
        public static final int textView1=0x7f0700aa;
        public static final int textView2=0x7f0700ad;
        public static final int textViewBrain=0x7f070007;
        public static final int textViewEars=0x7f070011;
        public static final int textViewEyes=0x7f07000c;
        public static final int textViewFingers=0x7f07002f;
        public static final int textViewHeart=0x7f070025;
        public static final int textViewImmune=0x7f070016;
        public static final int textViewLungs=0x7f070020;
        public static final int textViewMuscles=0x7f07001b;
        public static final int textViewProgress=0x7f0700a8;
        public static final int textViewSkin=0x7f070034;
        public static final int textViewStomach=0x7f07002a;
        public static final int textWatchBiologyOfBreathing=0x7f070069;
        public static final int text_text_one_exhale=0x7f0700e2;
        public static final int text_text_one_inhale=0x7f0700e8;
        public static final int textmh1=0x7f0700d4;
        public static final int textmh2=0x7f0700d5;
        public static final int textmh3=0x7f0700d6;
        public static final int textmh4=0x7f0700d7;
        public static final int textmh5=0x7f0700d8;
        public static final int textmh6=0x7f0700d9;
        public static final int time=0x7f0700a2;
        public static final int time_current=0x7f0700a0;
        public static final int top=0x7f070001;
        public static final int toptext=0x7f070092;
        public static final int total_score=0x7f0700ee;
        public static final int unlockButton=0x7f0700d2;
        public static final int webkitInformationWebView=0x7f07004e;
        public static final int webkitWebView=0x7f07008b;
        public static final int webkitWebViewFramed=0x7f070047;
        public static final int webview=0x7f0700fd;
        public static final int webviewTipLayout=0x7f0700f6;
        public static final int webviewWrapper=0x7f0700ff;
        public static final int workflowStep=0x7f0700fe;
    }
    public static final class layout {
        public static final int b2r_biologyofbreathing=0x7f030000;
        public static final int b2r_body_scanner_layout=0x7f030001;
        public static final int b2r_body_scanner_line_buttons=0x7f030002;
        public static final int b2r_choose_visual_setting=0x7f030003;
        public static final int b2r_dialog=0x7f030004;
        public static final int b2r_dialog_land=0x7f030005;
        public static final int b2r_firstlaunchlayout=0x7f030006;
        public static final int b2r_framed_web_view_layout=0x7f030007;
        public static final int b2r_inhale=0x7f030008;
        public static final int b2r_learnwatch=0x7f030009;
        public static final int b2r_post_exhale_length=0x7f03000a;
        public static final int b2r_post_inhale_length=0x7f03000b;
        public static final int b2r_pre_set_exhale_length=0x7f03000c;
        public static final int b2r_pre_set_inhale_length=0x7f03000d;
        public static final int b2r_rate_post_layout=0x7f03000e;
        public static final int b2r_rate_pre_layout=0x7f03000f;
        public static final int b2r_read=0x7f030010;
        public static final int b2r_read_n_watch_switcher=0x7f030011;
        public static final int b2r_rerun=0x7f030012;
        public static final int b2r_row=0x7f030013;
        public static final int b2r_selected_background_music=0x7f030014;
        public static final int b2r_start_breathing=0x7f030015;
        public static final int base_navigation_activity=0x7f030016;
        public static final int bcplayer_controls=0x7f030017;
        public static final int breath2relax_exhale_text=0x7f030018;
        public static final int breath2relax_exhale_widgets=0x7f030019;
        public static final int breath2relax_inhale_text=0x7f03001a;
        public static final int breath2relax_inhale_widgets=0x7f03001b;
        public static final int breath_to_relax=0x7f03001c;
        public static final int breathlayout=0x7f03001d;
        public static final int header=0x7f03001e;
        public static final int helplayout=0x7f03001f;
        public static final int learn=0x7f030020;
        public static final int list_layout=0x7f030021;
        public static final int main=0x7f030022;
        public static final int ratelayout=0x7f030023;
        public static final int readapplicationguide=0x7f030024;
        public static final int readbodyeffects=0x7f030025;
        public static final int readbreathingeffects=0x7f030026;
        public static final int security_configure_activity=0x7f030027;
        public static final int security_forgot_password_activity=0x7f030028;
        public static final int security_unlock_activity=0x7f030029;
        public static final int selected_background_music_head=0x7f03002a;
        public static final int selected_background_music_items_pull_down=0x7f03002b;
        public static final int selected_background_music_row=0x7f03002c;
        public static final int set_exhale_length_text=0x7f03002d;
        public static final int set_inhale_length_text=0x7f03002e;
        public static final int simple_qa_manager_activity=0x7f03002f;
        public static final int simple_qa_manager_list_item=0x7f030030;
        public static final int single_choice_question_activity=0x7f030031;
        public static final int splash=0x7f030032;
        public static final int start_breathing_text=0x7f030033;
        public static final int start_breathing_widget=0x7f030034;
        public static final int tiplayout=0x7f030035;
        public static final int tracklayout=0x7f030036;
        public static final int video_activity=0x7f030037;
        public static final int web_view=0x7f030038;
        public static final int webview_activity=0x7f030039;
        public static final int workflow_step=0x7f03003a;
    }
    public static final class menu {
        public static final int main_menu=0x7f0c0000;
        public static final int track_menu=0x7f0c0001;
        public static final int youtube_option=0x7f0c0002;
    }
    public static final class raw {
        public static final int ambientevenings=0x7f060000;
        public static final int evosolution=0x7f060001;
        public static final int f_1_1=0x7f060002;
        public static final int f_1_2=0x7f060003;
        public static final int f_2_1=0x7f060004;
        public static final int f_2_2=0x7f060005;
        public static final int f_3_1=0x7f060006;
        public static final int f_3_2=0x7f060007;
        public static final int f_4_1=0x7f060008;
        public static final int f_4_2=0x7f060009;
        public static final int f_5_1=0x7f06000a;
        public static final int f_5_2=0x7f06000b;
        public static final int f_6_1=0x7f06000c;
        public static final int f_6_2=0x7f06000d;
        public static final int f_7_1=0x7f06000e;
        public static final int f_7_2=0x7f06000f;
        public static final int f_8_1=0x7f060010;
        public static final int f_8_2=0x7f060011;
        public static final int f_breathe_naturally=0x7f060012;
        public static final int f_continue_breathe=0x7f060013;
        public static final int f_count_backward=0x7f060014;
        public static final int f_focus_breathing=0x7f060015;
        public static final int f_in_deep_1=0x7f060016;
        public static final int f_in_deep_2=0x7f060017;
        public static final int f_in_deep_3=0x7f060018;
        public static final int f_in_deep_4=0x7f060019;
        public static final int f_in_expand=0x7f06001a;
        public static final int f_out_deflate=0x7f06001b;
        public static final int f_out_slow_1=0x7f06001c;
        public static final int f_out_slow_2=0x7f06001d;
        public static final int f_out_slow_3=0x7f06001e;
        public static final int f_out_slow_4=0x7f06001f;
        public static final int f_pause_naturally=0x7f060020;
        public static final int f_poststart=0x7f060021;
        public static final int f_postvas=0x7f060022;
        public static final int f_prestart=0x7f060023;
        public static final int f_prevas=0x7f060024;
        public static final int f_relax_1=0x7f060025;
        public static final int f_relax_2=0x7f060026;
        public static final int f_relax_3=0x7f060027;
        public static final int f_relax_4=0x7f060028;
        public static final int f_say_number=0x7f060029;
        public static final int f_say_word_1=0x7f06002a;
        public static final int f_say_word_2=0x7f06002b;
        public static final int f_smooth_easy=0x7f06002c;
        public static final int f_think_number=0x7f06002d;
        public static final int f_try_rythmic=0x7f06002e;
        public static final int f_yourself=0x7f06002f;
        public static final int ideal_tts_aggregated=0x7f060030;
        public static final int oceanmist=0x7f060031;
        public static final int waningmoments=0x7f060032;
        public static final int watermark=0x7f060033;
    }
    public static final class string {
        /**  Accessibility 
         */
        public static final int accessibility_tab=0x7f080008;
        public static final int accessibility_toast_prefix=0x7f080009;
        public static final int add=0x7f080081;
        public static final int add_values=0x7f080080;
        public static final int app_name=0x7f080025;
        public static final int back=0x7f080000;
        public static final int backgroundMusic=0x7f08006f;
        public static final int backgroundScenery=0x7f080070;
        public static final int biologyOfStress=0x7f080071;
        public static final int body_scanner_label_brain=0x7f080050;
        public static final int body_scanner_label_ears=0x7f080051;
        public static final int body_scanner_label_eyes=0x7f080055;
        public static final int body_scanner_label_fingers=0x7f080054;
        public static final int body_scanner_label_heart=0x7f080053;
        public static final int body_scanner_label_immune=0x7f080056;
        public static final int body_scanner_label_lungs=0x7f080057;
        public static final int body_scanner_label_muscles=0x7f080052;
        public static final int body_scanner_label_skin=0x7f080059;
        public static final int body_scanner_label_stomach=0x7f080058;
        public static final int bodysReactionToStress=0x7f080076;
        public static final int breath_duration_exhale=0x7f080065;
        public static final int breath_duration_intake=0x7f080064;
        public static final int breath_repetition_progress=0x7f080066;
        public static final int breatheLabel=0x7f080026;
        public static final int buttonAbout=0x7f080027;
        public static final int buttonActivity=0x7f080028;
        public static final int buttonAnimateStart=0x7f080030;
        public static final int buttonAnimateStop=0x7f080031;
        public static final int buttonBack=0x7f080029;
        public static final int buttonBodyScanner=0x7f080032;
        public static final int buttonBreathe=0x7f08002a;
        public static final int buttonBrightCove=0x7f080044;
        public static final int buttonCancel=0x7f08002b;
        public static final int buttonChoose=0x7f08002c;
        public static final int buttonClose=0x7f08002d;
        public static final int buttonDone=0x7f08002e;
        public static final int buttonHelp=0x7f080033;
        /**  Unused by active code (but referenced in baggage) 
         */
        public static final int buttonLengthen=0x7f0800ba;
        public static final int buttonNext=0x7f080034;
        public static final int buttonPause=0x7f080035;
        public static final int buttonRead=0x7f080036;
        public static final int buttonReady=0x7f080083;
        public static final int buttonRetry=0x7f080084;
        public static final int buttonSave=0x7f080039;
        public static final int buttonSet=0x7f08003a;
        public static final int buttonSetBreatheLength=0x7f08003b;
        public static final int buttonSettings=0x7f08003c;
        public static final int buttonShorten=0x7f0800bb;
        public static final int buttonShowMeHow=0x7f08003d;
        public static final int buttonSkip=0x7f08003e;
        public static final int buttonStart=0x7f08003f;
        public static final int buttonTip=0x7f080040;
        public static final int buttonTrack=0x7f080041;
        public static final int buttonView=0x7f080045;
        public static final int buttonWatch=0x7f080046;
        public static final int buttonYoutubeOff=0x7f080043;
        public static final int buttonYoutubeOn=0x7f080042;
        public static final int cancel=0x7f080001;
        public static final int chart_high=0x7f08007c;
        public static final int chart_low=0x7f08007d;
        public static final int could_not_play_video=0x7f080088;
        public static final int details=0x7f08001c;
        public static final int diaphragmaticBreathing=0x7f080072;
        public static final int done_done=0x7f08006e;
        public static final int dontShow=0x7f08002f;
        public static final int effectsOfStressOnTheBody=0x7f080073;
        public static final int eula_accept=0x7f080022;
        public static final int eula_refuse=0x7f080023;
        public static final int eula_text=0x7f080024;
        /**  EULA 
         */
        public static final int eula_title=0x7f080021;
        public static final int groups_tab=0x7f080079;
        public static final int guideSkip=0x7f08004f;
        public static final int guideSteps=0x7f08004e;
        public static final int guideWelcome=0x7f08004d;
        public static final int howToBreath=0x7f080074;
        public static final int loading=0x7f08008a;
        public static final int main_no_items=0x7f08006d;
        public static final int menu_pan=0x7f080086;
        public static final int menu_reset=0x7f080087;
        public static final int menu_zoom=0x7f080085;
        public static final int navigation_left_button_desc=0x7f080007;
        public static final int navigation_right_button_desc=0x7f080006;
        public static final int navigation_title_desc=0x7f080005;
        public static final int new_series=0x7f080082;
        public static final int next=0x7f08001f;
        public static final int no=0x7f080004;
        public static final int no_conenction_message=0x7f080089;
        public static final int notes_tab=0x7f08007b;
        public static final int ok=0x7f08008b;
        public static final int personalize=0x7f080037;
        public static final int personalizeText=0x7f08004c;
        public static final int prerate_label=0x7f08005a;
        public static final int pressStartWhenReady=0x7f080077;
        public static final int proceed=0x7f080068;
        public static final int rateStress=0x7f08005b;
        public static final int rating_relaxed=0x7f08005d;
        public static final int ratings_angry=0x7f080060;
        public static final int ratings_calm=0x7f08005f;
        public static final int ratings_content=0x7f080061;
        public static final int ratings_distracted=0x7f080062;
        public static final int ratings_focused=0x7f080063;
        public static final int ratings_pressured=0x7f08005e;
        public static final int ratings_stressed=0x7f08005c;
        public static final int readapplicationguide=0x7f08006b;
        public static final int readbodyeffects=0x7f080069;
        public static final int readbreathingeffects=0x7f08006a;
        public static final int readstresseffects=0x7f08006c;
        public static final int restart=0x7f080067;
        /**   Graph results 
         */
        public static final int results_title=0x7f080078;
        public static final int save=0x7f080002;
        public static final int scales_tab=0x7f08007a;
        public static final int security_answer_already_set_hint=0x7f080016;
        public static final int security_bad_input_message=0x7f08001a;
        public static final int security_configure_title=0x7f08000c;
        public static final int security_enabled=0x7f080011;
        public static final int security_enter_answer1_hint=0x7f080015;
        public static final int security_enter_answer2_hint=0x7f080018;
        public static final int security_enter_password_hint=0x7f080010;
        public static final int security_enter_question1_hint=0x7f080014;
        public static final int security_enter_question2_hint=0x7f080017;
        public static final int security_forgot_password_button=0x7f08000f;
        public static final int security_forgot_password_instructions=0x7f080019;
        public static final int security_forgot_password_settings=0x7f080013;
        public static final int security_forgot_password_title=0x7f08000b;
        public static final int security_password_already_set_hint=0x7f080012;
        public static final int security_unlock_button=0x7f08000e;
        public static final int security_unlock_instructions=0x7f08000d;
        /**  Security 
         */
        public static final int security_unlock_title=0x7f08000a;
        public static final int send_results=0x7f08001d;
        public static final int send_results_subject=0x7f080020;
        public static final int setBreathLengthPreInstructions=0x7f08008c;
        public static final int setExhaleConfirmText=0x7f080090;
        public static final int setExhaleLength=0x7f080049;
        public static final int setExhaleLengthDefault=0x7f08004b;
        public static final int setExhaleLengthInstructions=0x7f08008e;
        public static final int setInhaleConfirmText=0x7f08008f;
        public static final int setInhaleLength=0x7f080048;
        public static final int setInhaleLengthDefault=0x7f08004a;
        public static final int setInhaleLengthInstructions=0x7f08008d;
        public static final int settings=0x7f080038;
        public static final int settings__desc=0x7f080093;
        /**  Settings section 
         */
        public static final int settings__key=0x7f080091;
        public static final int settings__title=0x7f080092;
        public static final int settings_anon_data_key=0x7f0800b6;
        public static final int settings_audio=0x7f0800a1;
        public static final int settings_audio_prompt_key=0x7f0800a2;
        public static final int settings_background_desc=0x7f080097;
        public static final int settings_background_key=0x7f080095;
        public static final int settings_background_music_desc=0x7f0800a7;
        public static final int settings_background_music_key=0x7f0800a5;
        public static final int settings_background_music_title=0x7f0800a6;
        public static final int settings_background_title=0x7f080096;
        public static final int settings_breathing_instruction_key=0x7f0800a3;
        public static final int settings_cycle=0x7f0800a8;
        public static final int settings_exhale_length_key=0x7f0800ab;
        public static final int settings_exhale_length_summary=0x7f0800ac;
        public static final int settings_feedback_key=0x7f0800b5;
        public static final int settings_guide_prompt_key=0x7f0800b2;
        public static final int settings_help=0x7f0800b1;
        public static final int settings_improve=0x7f0800b3;
        public static final int settings_inhale_length_key=0x7f0800a9;
        public static final int settings_inhale_length_summary=0x7f0800aa;
        public static final int settings_metronome_desc=0x7f08009a;
        public static final int settings_metronome_key=0x7f080098;
        public static final int settings_metronome_title=0x7f080099;
        public static final int settings_num_cycles_key=0x7f0800ad;
        public static final int settings_num_cycles_summary=0x7f0800ae;
        public static final int settings_play_music_key=0x7f0800a4;
        public static final int settings_prevent_screen_timeout_desc=0x7f0800a0;
        public static final int settings_prevent_screen_timeout_key=0x7f08009e;
        public static final int settings_prevent_screen_timeout_title=0x7f08009f;
        public static final int settings_rate_key=0x7f0800b4;
        public static final int settings_stress_tracking=0x7f0800af;
        public static final int settings_track_stress_key=0x7f0800b0;
        public static final int settings_visual=0x7f080094;
        public static final int settings_visual_prompt_desc=0x7f08009d;
        public static final int settings_visual_prompt_key=0x7f08009b;
        public static final int settings_visual_prompt_title=0x7f08009c;
        public static final int settings_youtube_desc=0x7f0800b9;
        public static final int settings_youtube_key=0x7f0800b7;
        public static final int settings_youtube_title=0x7f0800b8;
        public static final int start_questionare=0x7f08001e;
        public static final int tipTitle=0x7f080047;
        /**  QA 
         */
        public static final int total_score=0x7f08001b;
        public static final int watchBiologyOfBreathing=0x7f080075;
        public static final int x=0x7f08007e;
        public static final int y=0x7f08007f;
        public static final int yes=0x7f080003;
    }
    public static final class style {
        public static final int Animations=0x7f090008;
        public static final int Animations_SplashScreen=0x7f090009;
        public static final int T2Theme=0x7f090001;
        public static final int T2Theme_Light=0x7f090002;
        /** 
    <style name="WindowTitleBackground" parent="@android:style/WindowTitleBackground">
    	<item name="android:layout_margin">0dip</item>
    	<item name="android:background">@drawable/title_background</item>
    </style>
    
    <style name="Widget.TextView.ListSeparator" parent="@android:style/Widget.TextView.ListSeparator.White">
    	<item name="android:layout_width">fill_parent</item>
    	<item name="android:layout_height">wrap_content</item>
    	<item name="android:textAppearance">@android:style/TextAppearance.Medium</item>
    	<item name="android:textSize">20sp</item>
        <item name="android:gravity">center_vertical</item>
    </style>

         */
        public static final int TextAppearance_Small=0x7f090006;
        public static final int TextAppearance_WindowTitle=0x7f090004;
        public static final int VASSeekBar=0x7f090003;
        public static final int Widget_ListView=0x7f090005;
        public static final int divider=0x7f090007;
        public static final int navigationHeaderTextAppearance=0x7f090000;
    }
    public static final class xml {
        public static final int settings=0x7f050000;
        public static final int tips=0x7f050001;
    }
    public static final class styleable {
        /** Attributes that can be used with a AbsoluteLayout_Layout.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #AbsoluteLayout_Layout_layout_x org.t2health.breathe2relax:layout_x}</code></td><td></td></tr>
           <tr><td><code>{@link #AbsoluteLayout_Layout_layout_y org.t2health.breathe2relax:layout_y}</code></td><td></td></tr>
           </table>
           @see #AbsoluteLayout_Layout_layout_x
           @see #AbsoluteLayout_Layout_layout_y
         */
        public static final int[] AbsoluteLayout_Layout = {
            0x7f010000, 0x7f010001
        };
        /**
          <p>This symbol is the offset where the {@link org.t2health.breathe2relax.R.attr#layout_x}
          attribute's value can be found in the {@link #AbsoluteLayout_Layout} array.


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:layout_x
        */
        public static final int AbsoluteLayout_Layout_layout_x = 0;
        /**
          <p>This symbol is the offset where the {@link org.t2health.breathe2relax.R.attr#layout_y}
          attribute's value can be found in the {@link #AbsoluteLayout_Layout} array.


          <p>Must be a dimension value, which is a floating point number appended with a unit such as "<code>14.5sp</code>".
Available units are: px (pixels), dp (density-independent pixels), sp (scaled pixels based on preferred font size),
in (inches), mm (millimeters).
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:layout_y
        */
        public static final int AbsoluteLayout_Layout_layout_y = 1;
        /** Attributes that can be used with a T2Theme.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #T2Theme_navigationHeaderBgColor org.t2health.breathe2relax:navigationHeaderBgColor}</code></td><td></td></tr>
           <tr><td><code>{@link #T2Theme_navigationHeaderTextAppearance org.t2health.breathe2relax:navigationHeaderTextAppearance}</code></td><td></td></tr>
           <tr><td><code>{@link #T2Theme_navigationHeaderTextColor org.t2health.breathe2relax:navigationHeaderTextColor}</code></td><td></td></tr>
           </table>
           @see #T2Theme_navigationHeaderBgColor
           @see #T2Theme_navigationHeaderTextAppearance
           @see #T2Theme_navigationHeaderTextColor
         */
        public static final int[] T2Theme = {
            0x7f010005, 0x7f010006, 0x7f010007
        };
        /**
          <p>This symbol is the offset where the {@link org.t2health.breathe2relax.R.attr#navigationHeaderBgColor}
          attribute's value can be found in the {@link #T2Theme} array.


          <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:navigationHeaderBgColor
        */
        public static final int T2Theme_navigationHeaderBgColor = 2;
        /**
          <p>This symbol is the offset where the {@link org.t2health.breathe2relax.R.attr#navigationHeaderTextAppearance}
          attribute's value can be found in the {@link #T2Theme} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name android:navigationHeaderTextAppearance
        */
        public static final int T2Theme_navigationHeaderTextAppearance = 0;
        /**
          <p>This symbol is the offset where the {@link org.t2health.breathe2relax.R.attr#navigationHeaderTextColor}
          attribute's value can be found in the {@link #T2Theme} array.


          <p>Must be a color value, in the form of "<code>#<i>rgb</i></code>", "<code>#<i>argb</i></code>",
"<code>#<i>rrggbb</i></code>", or "<code>#<i>aarrggbb</i></code>".
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:navigationHeaderTextColor
        */
        public static final int T2Theme_navigationHeaderTextColor = 1;
        /** Attributes that can be used with a TextImageButton.
           <p>Includes the following attributes:</p>
           <table>
           <colgroup align="left" />
           <colgroup align="left" />
           <tr><th>Attribute</th><th>Description</th></tr>
           <tr><td><code>{@link #TextImageButton_imagePosition org.t2health.breathe2relax:imagePosition}</code></td><td></td></tr>
           <tr><td><code>{@link #TextImageButton_src org.t2health.breathe2relax:src}</code></td><td></td></tr>
           <tr><td><code>{@link #TextImageButton_text org.t2health.breathe2relax:text}</code></td><td></td></tr>
           </table>
           @see #TextImageButton_imagePosition
           @see #TextImageButton_src
           @see #TextImageButton_text
         */
        public static final int[] TextImageButton = {
            0x7f010002, 0x7f010003, 0x7f010004
        };
        /**
          <p>This symbol is the offset where the {@link org.t2health.breathe2relax.R.attr#imagePosition}
          attribute's value can be found in the {@link #TextImageButton} array.


          <p>Must be one or more (separated by '|') of the following constant values.</p>
<table>
<colgroup align="left" />
<colgroup align="left" />
<colgroup align="left" />
<tr><th>Constant</th><th>Value</th><th>Description</th></tr>
<tr><td><code>left</code></td><td>0</td><td></td></tr>
<tr><td><code>top</code></td><td>1</td><td></td></tr>
<tr><td><code>right</code></td><td>2</td><td></td></tr>
<tr><td><code>bottom</code></td><td>3</td><td></td></tr>
</table>
          @attr name android:imagePosition
        */
        public static final int TextImageButton_imagePosition = 2;
        /**
          <p>This symbol is the offset where the {@link org.t2health.breathe2relax.R.attr#src}
          attribute's value can be found in the {@link #TextImageButton} array.


          <p>Must be a reference to another resource, in the form "<code>@[+][<i>package</i>:]<i>type</i>:<i>name</i></code>"
or to a theme attribute in the form "<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>".
          @attr name android:src
        */
        public static final int TextImageButton_src = 1;
        /**
          <p>This symbol is the offset where the {@link org.t2health.breathe2relax.R.attr#text}
          attribute's value can be found in the {@link #TextImageButton} array.


          <p>Must be a string value, using '\\;' to escape characters such as '\\n' or '\\uxxxx' for a unicode character.
<p>This may also be a reference to a resource (in the form
"<code>@[<i>package</i>:]<i>type</i>:<i>name</i></code>") or
theme attribute (in the form
"<code>?[<i>package</i>:][<i>type</i>:]<i>name</i></code>")
containing a value of this type.
          @attr name android:text
        */
        public static final int TextImageButton_text = 0;
    };
}
