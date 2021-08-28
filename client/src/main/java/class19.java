import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.net.URL;

public abstract class class19 extends Applet implements Runnable, FocusListener, WindowListener {
   protected static class130 field101;
   protected static int field120 = 0;
   protected static long[] field105 = new long[32];
   protected static long[] field112 = new long[32];
   static boolean field100 = false;
   static class19 field115 = null;
   static class275 archive17;
   static class337 field128;
   static int field102 = 20;
   static int field103 = 1;
   static int field118 = 500;
   static int field126 = 0;
   static long field117 = 0L;
   static long field123 = -1L;
   static long field127 = -1L;
   static volatile boolean field125 = true;
   boolean field119 = false;
   boolean field130 = false;
   class10 field122;
   int field108;
   int field109 = 0;
   int field110 = 0;
   int field111;
   int field113;
   int field114;
   Canvas field106;
   Frame field99;
   Clipboard field97;
   final EventQueue field124;
   protected int field104;
   protected int field98;
   volatile boolean field107 = false;
   volatile boolean field116 = true;
   volatile long field121 = 0L;

   public static boolean method302() {
      try {
         if (2 == class235.field2819) {
            if (null == class181.field2080) {
               class181.field2080 = class240.method4132(class235.field2820, class235.field2822, class97.field1264);
               if (class181.field2080 == null) {
                  return false;
               }
            }

            if (null == class143.field1576) {
               class143.field1576 = new class28(class235.field2817, class235.field2815);
            }

            if (class235.field2816.method3968(class181.field2080, class235.field2818, class143.field1576, 22050)) {
               class235.field2816.method4010();
               class235.field2816.method3966(class147.field1612);
               class235.field2816.method3971(class181.field2080, class146.field1598);
               class235.field2819 = 0;
               class181.field2080 = null;
               class143.field1576 = null;
               class235.field2820 = null;
               return true;
            }
         }
      } catch (Exception var2) {
         var2.printStackTrace();
         class235.field2816.method3972();
         class235.field2819 = 0;
         class181.field2080 = null;
         class143.field1576 = null;
         class235.field2820 = null;
      }

      return false;
   }

   protected class19() {
      EventQueue var1 = null;

      try {
         var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
      } catch (Throwable var3) {
      }

      this.field124 = var1;
      class48.method1317(new class12());
   }

   protected final void method258(int var1, int var2) {
      if (var1 != this.field113 || this.field114 != var2) {
         this.method213();
      }

      this.field113 = var1;
      this.field114 = var2;
   }

   final void method206(Object var1) {
      if (null != this.field124) {
         for(int var3 = 0; var3 < 50 && this.field124.peekEvent() != null; ++var3) {
            class210.method3831(1L);
         }

         if (var1 != null) {
            this.field124.postEvent(new ActionEvent(var1, 1001, "dummy"));
         }

      }
   }

   protected class132 method155() {
      if (null == this.field122) {
         this.field122 = new class10();
         this.field122.method59(this.field106);
      }

      return this.field122;
   }

   protected void method156() {
      this.field97 = this.getToolkit().getSystemClipboard();
   }

   protected void method152(String var1) {
      this.field97.setContents(new StringSelection(var1), (ClipboardOwner)null);
   }

   protected final void method157() {
      if (class130.field1469.toLowerCase().indexOf("microsoft") != -1) {
         KeyHandler.field40[186] = 57;
         KeyHandler.field40[187] = 27;
         KeyHandler.field40[188] = 71;
         KeyHandler.field40[189] = 26;
         KeyHandler.field40[190] = 72;
         KeyHandler.field40[191] = 73;
         KeyHandler.field40[192] = 58;
         KeyHandler.field40[219] = 42;
         KeyHandler.field40[220] = 74;
         KeyHandler.field40[221] = 43;
         KeyHandler.field40[222] = 59;
         KeyHandler.field40[223] = 28;
      } else {
         KeyHandler.field40[44] = 71;
         KeyHandler.field40[45] = 26;
         KeyHandler.field40[46] = 72;
         KeyHandler.field40[47] = 73;
         KeyHandler.field40[59] = 57;
         KeyHandler.field40[61] = 27;
         KeyHandler.field40[91] = 42;
         KeyHandler.field40[92] = 74;
         KeyHandler.field40[93] = 43;
         KeyHandler.field40[192] = 28;
         KeyHandler.field40[222] = 58;
         KeyHandler.field40[520] = 59;
      }

      Canvas var2 = this.field106;
      var2.setFocusTraversalKeysEnabled(false);
      var2.addKeyListener(KeyHandler.field59);
      var2.addFocusListener(KeyHandler.field59);
   }

   public static int method303(CharSequence var0) {
      int var2 = var0.length();
      int var3 = 0;

      for(int var4 = 0; var4 < var2; ++var4) {
         var3 = (var3 << 5) - var3 + class274.method4376(var0.charAt(var4));
      }

      return var3;
   }

   protected final void method158() {
      class181.method3189(this.field106);
   }

   final void method159() {
      Container var2 = this.method250();
      if (var2 != null) {
         class337 var3 = this.method184();
         this.field104 = Math.max(var3.field3923, this.field111);
         this.field98 = Math.max(var3.field3921, this.field108);
         if (this.field104 <= 0) {
            this.field104 = 1;
         }

         if (this.field98 <= 0) {
            this.field98 = 1;
         }

         class69.canvasWidth = Math.min(this.field104, this.field113);
         client.canvasHeight = Math.min(this.field98, this.field114);
         this.field109 = (this.field104 - class69.canvasWidth) / 2;
         this.field110 = 0;
         this.field106.setSize(class69.canvasWidth, client.canvasHeight);
         class264.field3194 = new class18(class69.canvasWidth, client.canvasHeight, this.field106);
         if (var2 == this.field99) {
            Insets var4 = this.field99.getInsets();
            this.field106.setLocation(var4.left + this.field109, var4.top + this.field110);
         } else {
            this.field106.setLocation(this.field109, this.field110);
         }

         this.field116 = true;
         this.method163();
      }
   }

   void method161() {
      int var2 = this.field109;
      int var3 = this.field110;
      int var4 = this.field104 - class69.canvasWidth - var2;
      int var5 = this.field98 - client.canvasHeight - var3;
      if (var2 > 0 || var4 > 0 || var3 > 0 || var5 > 0) {
         try {
            Container var6 = this.method250();
            int var7 = 0;
            int var8 = 0;
            if (var6 == this.field99) {
               Insets var9 = this.field99.getInsets();
               var7 = var9.left;
               var8 = var9.top;
            }

            Graphics var11 = var6.getGraphics();
            var11.setColor(Color.black);
            if (var2 > 0) {
               var11.fillRect(var7, var8, var2, this.field98);
            }

            if (var3 > 0) {
               var11.fillRect(var7, var8, this.field104, var3);
            }

            if (var4 > 0) {
               var11.fillRect(var7 + this.field104 - var4, var8, var4, this.field98);
            }

            if (var5 > 0) {
               var11.fillRect(var7, var8 + this.field98 - var5, this.field104, var5);
            }
         } catch (Exception var10) {
         }
      }

   }

   final void method299() {
      Canvas var2 = this.field106;
      var2.removeKeyListener(KeyHandler.field59);
      var2.removeFocusListener(KeyHandler.field59);
      KeyHandler.field51 = -1;
      class176.method3146(this.field106);
      if (null != this.field122) {
         this.field122.method61(this.field106);
      }

      this.method274();
      Canvas var3 = this.field106;
      var3.setFocusTraversalKeysEnabled(false);
      var3.addKeyListener(KeyHandler.field59);
      var3.addFocusListener(KeyHandler.field59);
      class181.method3189(this.field106);
      if (null != this.field122) {
         this.field122.method59(this.field106);
      }

      this.method213();
   }

   protected final void method217(int var1, int var2, int var3) {
      try {
         if (null != field115) {
            ++field126;
            if (field126 >= 3) {
               this.js5Error("alreadyloaded");
               return;
            }

            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            return;
         }

         field115 = this;
         class69.canvasWidth = var1;
         client.canvasHeight = var2;
         class409.field4317 = var3;
         class409.field4318 = this;
         if (null == field101) {
            field101 = new class130();
         }

         field101.method2257(this, 1);
      } catch (Exception var6) {
         class333.method5330((String)null, var6);
         this.js5Error("crash");
      }

   }

   final synchronized void method274() {
      Container var2 = this.method250();
      if (this.field106 != null) {
         this.field106.removeFocusListener(this);
         var2.remove(this.field106);
      }

      class69.canvasWidth = Math.max(var2.getWidth(), this.field111);
      client.canvasHeight = Math.max(var2.getHeight(), this.field108);
      Insets var3;
      if (null != this.field99) {
         var3 = this.field99.getInsets();
         class69.canvasWidth -= var3.right + var3.left;
         client.canvasHeight -= var3.bottom + var3.top;
      }

      this.field106 = new class13(this);
      var2.setBackground(Color.BLACK);
      var2.setLayout((LayoutManager)null);
      var2.add(this.field106);
      this.field106.setSize(class69.canvasWidth, client.canvasHeight);
      this.field106.setVisible(true);
      this.field106.setBackground(Color.BLACK);
      if (this.field99 == var2) {
         var3 = this.field99.getInsets();
         this.field106.setLocation(this.field109 + var3.left, var3.top + this.field110);
      } else {
         this.field106.setLocation(this.field109, this.field110);
      }

      this.field106.addFocusListener(this);
      this.field106.requestFocus();
      this.field116 = true;
      if (null != class264.field3194 && class264.field3194.field4254 == class69.canvasWidth && class264.field3194.field4253 == client.canvasHeight) {
         ((class18)class264.field3194).method144(this.field106);
         class264.field3194.method6333(0, 0);
      } else {
         class264.field3194 = new class18(class69.canvasWidth, client.canvasHeight, this.field106);
      }

      this.field107 = false;
      this.field121 = class87.method1989();
   }

   protected final boolean method154() {
      String var2 = this.getDocumentBase().getHost().toLowerCase();
      if (!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
         if (!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
            if (var2.endsWith(ClientLauncher.CODEBASE)) {
               return true;
            } else {
               while(var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
                  var2 = var2.substring(0, var2.length() - 1);
               }

               if (var2.endsWith("192.168.1.")) {
                  return true;
               } else {
                  this.js5Error("invalidhost");
                  return false;
               }
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public void run() {
      try {
         if (null != class130.field1469) {
            String var1 = class130.field1469.toLowerCase();
            if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
               String var2 = class130.field1463;
               if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
                  this.js5Error("wrongjava");
                  return;
               }

               if (var2.startsWith("1.6.0_")) {
                  int var3;
                  for(var3 = 6; var3 < var2.length() && class282.method4533(var2.charAt(var3)); ++var3) {
                  }

                  String var4 = var2.substring(6, var3);
                  if (class250.method4284(var4) && class278.method4502(var4) < 10) {
                     this.js5Error("wrongjava");
                     return;
                  }
               }

               field103 = 5;
            }
         }

         this.setFocusCycleRoot(true);
         this.method274();
         this.method275();

         Object var7;
         try {
            var7 = new class129();
         } catch (Throwable var5) {
            var7 = new class135();
         }

         class85.field1199 = (class137)var7;

         while(field117 == 0L || class87.method1989() < field117) {
            class259.field3167 = class85.field1199.method2329(field102, field103);

            for(int var8 = 0; var8 < class259.field3167; ++var8) {
               this.method165();
            }

            this.method166();
            this.method206(this.field106);
         }
      } catch (Exception var6) {
         class333.method5330((String)null, var6);
         this.js5Error("crash");
      }

      this.method168();
   }

   void method165() {
      long var2 = class87.method1989();
      long var4 = field112[class328.field3864];
      field112[class328.field3864] = var2;
      class328.field3864 = 1 + class328.field3864 & 31;
      if (var4 != 0L && var2 > var4) {
      }

      synchronized(this) {
         class256.field3128 = field125;
      }

      this.method178();
   }

   void method166() {
      Container var2 = this.method250();
      long var3 = class87.method1989();
      long var5 = field105[class133.field1485];
      field105[class133.field1485] = var3;
      class133.field1485 = 1 + class133.field1485 & 31;
      if (var5 != 0L && var3 > var5) {
         int var7 = (int)(var3 - var5);
         field120 = (32000 + (var7 >> 1)) / var7;
      }

      if (++field118 - 1 > 50) {
         field118 -= 50;
         this.field116 = true;
         this.field106.setSize(class69.canvasWidth, client.canvasHeight);
         this.field106.setVisible(true);
         if (this.field99 == var2) {
            Insets var8 = this.field99.getInsets();
            this.field106.setLocation(this.field109 + var8.left, this.field110 + var8.top);
         } else {
            this.field106.setLocation(this.field109, this.field110);
         }
      }

      if (this.field107) {
         this.method299();
      }

      this.method167();
      this.method190(this.field116);
      if (this.field116) {
         this.method161();
      }

      this.field116 = false;
   }

   final void method167() {
      class337 var2 = this.method184();
      if (this.field104 != var2.field3923 || var2.field3921 != this.field98 || this.field119) {
         this.method159();
         this.field119 = false;
      }

   }

   final void method213() {
      this.field119 = true;
   }

   final synchronized void method168() {
      if (!field100) {
         field100 = true;

         try {
            this.field106.removeFocusListener(this);
         } catch (Exception var6) {
         }

         try {
            this.method179();
         } catch (Exception var5) {
         }

         if (null != this.field99) {
            try {
               System.exit(0);
            } catch (Throwable var4) {
            }
         }

         if (field101 != null) {
            try {
               field101.method2268();
            } catch (Exception var3) {
            }
         }

         this.method186();
      }
   }

   public final void start() {
      if (field115 == this && !field100) {
         field117 = 0L;
      }
   }

   public final void stop() {
      if (field115 == this && !field100) {
         field117 = class87.method1989() + 4000L;
      }
   }

   public final void destroy() {
      if (field115 == this && !field100) {
         field117 = class87.method1989();
         class210.method3831(5000L);
         this.method168();
      }
   }

   public final void update(Graphics var1) {
      this.paint(var1);
   }

   public final synchronized void paint(Graphics var1) {
      if (field115 == this && !field100) {
         this.field116 = true;
         if (class87.method1989() - this.field121 > 1000L) {
            Rectangle var2 = var1.getClipBounds();
            if (null == var2 || var2.width >= class69.canvasWidth && var2.height >= client.canvasHeight) {
               this.field107 = true;
            }
         }

      }
   }

   public final void focusGained(FocusEvent var1) {
      field125 = true;
      this.field116 = true;
   }

   public final void focusLost(FocusEvent var1) {
      field125 = false;
   }

   public final void windowActivated(WindowEvent var1) {
   }

   public final void windowClosed(WindowEvent var1) {
   }

   public final void windowClosing(WindowEvent var1) {
      this.destroy();
   }

   public final void windowDeactivated(WindowEvent var1) {
   }

   public final void windowDeiconified(WindowEvent var1) {
   }

   public final void windowIconified(WindowEvent var1) {
   }

   public final void windowOpened(WindowEvent var1) {
   }

   protected final void method180(int var1, String var2, boolean var3) {
      try {
         Graphics var5 = this.field106.getGraphics();
         if (null == class7.field13) {
            class7.field13 = new Font("Helvetica", 1, 13);
            class95.field1250 = this.field106.getFontMetrics(class7.field13);
         }

         if (var3) {
            var5.setColor(Color.black);
            var5.fillRect(0, 0, class69.canvasWidth, client.canvasHeight);
         }

         Color var6 = new Color(140, 17, 17);

         try {
            if (class55.field795 == null) {
               class55.field795 = this.field106.createImage(304, 34);
            }

            Graphics var7 = class55.field795.getGraphics();
            var7.setColor(var6);
            var7.drawRect(0, 0, 303, 33);
            var7.fillRect(2, 2, var1 * 3, 30);
            var7.setColor(Color.black);
            var7.drawRect(1, 1, 301, 31);
            var7.fillRect(3 * var1 + 2, 2, 300 - 3 * var1, 30);
            var7.setFont(class7.field13);
            var7.setColor(Color.white);
            var7.drawString(var2, (304 - class95.field1250.stringWidth(var2)) / 2, 22);
            var5.drawImage(class55.field795, class69.canvasWidth / 2 - 152, client.canvasHeight / 2 - 18, (ImageObserver)null);
         } catch (Exception var10) {
            int var8 = class69.canvasWidth / 2 - 152;
            int var9 = client.canvasHeight / 2 - 18;
            var5.setColor(var6);
            var5.drawRect(var8, var9, 303, 33);
            var5.fillRect(var8 + 2, var9 + 2, var1 * 3, 30);
            var5.setColor(Color.black);
            var5.drawRect(1 + var8, 1 + var9, 301, 31);
            var5.fillRect(var1 * 3 + var8 + 2, var9 + 2, 300 - 3 * var1, 30);
            var5.setFont(class7.field13);
            var5.setColor(Color.white);
            var5.drawString(var2, var8 + (304 - class95.field1250.stringWidth(var2)) / 2, var9 + 22);
         }
      } catch (Exception var11) {
         this.field106.repaint();
      }

   }

   protected final void method181() {
      class55.field795 = null;
      class7.field13 = null;
      class95.field1250 = null;
   }

   protected void js5Error(String var1) {
      if (!this.field130) {
         this.field130 = true;
         System.out.println("error_game_" + var1);

         try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
         } catch (Exception var4) {
         }

      }
   }

   Container method250() {
      return (Container)(null != this.field99 ? this.field99 : this);
   }

   class337 method184() {
      Container var2 = this.method250();
      int var3 = Math.max(var2.getWidth(), this.field111);
      int var4 = Math.max(var2.getHeight(), this.field108);
      if (null != this.field99) {
         Insets var5 = this.field99.getInsets();
         var3 -= var5.right + var5.left;
         var4 -= var5.bottom + var5.top;
      }

      return new class337(var3, var4);
   }

   protected final boolean method185() {
      return null != this.field99;
   }

   static final void method301(Interface var0, int var1, int var2) {
      if (1 == var0.field2961) {
         class8.method38(var0.field3085, "", 24, 0, 0, var0.id);
      }

      String var4;
      if (2 == var0.field2961 && !client.field563) {
         var4 = class25.method413(var0);
         if (var4 != null) {
            class8.method38(var4, class44.method770(65280) + var0.field3041, 25, 0, -1, var0.id);
         }
      }

      if (var0.field2961 == 3) {
         class8.method38(class270.field3389, "", 26, 0, 0, var0.id);
      }

      if (var0.field2961 == 4) {
         class8.method38(var0.field3085, "", 28, 0, 0, var0.id);
      }

      if (5 == var0.field2961) {
         class8.method38(var0.field3085, "", 29, 0, 0, var0.id);
      }

      if (6 == var0.field2961 && client.field574 == null) {
         class8.method38(var0.field3085, "", 30, 0, -1, var0.id);
      }

      int var5;
      int var6;
      int var7;
      int var8;
      int var16;
      if (var0.field2977 == 2) {
         var16 = 0;

         for(var5 = 0; var5 < var0.field2990; ++var5) {
            for(var6 = 0; var6 < var0.field2973; ++var6) {
               var7 = var6 * (32 + var0.field3025);
               var8 = (var0.field3026 + 32) * var5;
               if (var16 < 20) {
                  var7 += var0.field2946[var16];
                  var8 += var0.field3028[var16];
               }

               if (var1 >= var7 && var2 >= var8 && var1 < var7 + 32 && var2 < 32 + var8) {
                  client.field519 = var16;
                  client.field515 = var0;
                  if (var0.field3086[var16] > 0) {
                     class157 var9 = KeyHandler.method93(var0.field3086[var16] - 1);
                     if (client.field561 == 1 && ClientPacket.method3899(class241.method4140(var0))) {
                        if (class62.field912 != var0.id || KeyHandler.field41 != var16) {
                           class8.method38(class270.field3380, client.field530 + " " + class79.field1143 + " " + class44.method770(16748608) + var9.field1836, 31, var9.field1802, var16, var0.id);
                        }
                     } else if (client.field563 && ClientPacket.method3899(class241.method4140(var0))) {
                        if ((class208.field2474 & 16) == 16) {
                           class8.method38(client.field566, client.field466 + " " + class79.field1143 + " " + class44.method770(16748608) + var9.field1836, 32, var9.field1802, var16, var0.id);
                        }
                     } else {
                        String[] var10 = var9.field1810;
                        int var11 = -1;
                        if (client.field554 && class80.method1850()) {
                           var11 = var9.method2701();
                        }

                        if (ClientPacket.method3899(class241.method4140(var0))) {
                           for(int var12 = 4; var12 >= 3; --var12) {
                              if (var12 != var11) {
                                 class377.method5855(var0, var9, var16, var12, false);
                              }
                           }
                        }

                        int var13 = class241.method4140(var0);
                        boolean var22 = 0 != (var13 >> 31 & 1);
                        if (var22) {
                           class8.method38(class270.field3380, class44.method770(16748608) + var9.field1836, 38, var9.field1802, var16, var0.id);
                        }

                        class250 var10000 = (class250)null;
                        int var14;
                        if (ClientPacket.method3899(class241.method4140(var0))) {
                           for(var14 = 2; var14 >= 0; --var14) {
                              if (var14 != var11) {
                                 class377.method5855(var0, var9, var16, var14, false);
                              }
                           }

                           if (var11 >= 0) {
                              class377.method5855(var0, var9, var16, var11, true);
                           }
                        }

                        var10 = var0.field3030;
                        if (null != var10) {
                           for(var14 = 4; var14 >= 0; --var14) {
                              if (var10[var14] != null) {
                                 byte var15 = 0;
                                 if (var14 == 0) {
                                    var15 = 39;
                                 }

                                 if (var14 == 1) {
                                    var15 = 40;
                                 }

                                 if (var14 == 2) {
                                    var15 = 41;
                                 }

                                 if (var14 == 3) {
                                    var15 = 42;
                                 }

                                 if (4 == var14) {
                                    var15 = 43;
                                 }

                                 class8.method38(var10[var14], class44.method770(16748608) + var9.field1836, var15, var9.field1802, var16, var0.id);
                              }
                           }
                        }

                        class8.method38(class270.field3381, class44.method770(16748608) + var9.field1836, 1005, var9.field1802, var16, var0.id);
                     }
                  }
               }

               ++var16;
            }
         }
      }

      if (var0.field2993) {
         if (client.field563) {
            if (class111.method2112(class241.method4140(var0)) && 32 == (class208.field2474 & 32)) {
               class8.method38(client.field566, client.field466 + " " + class79.field1143 + " " + var0.field3037, 58, 0, var0.field3031, var0.id);
            }
         } else {
            for(var16 = 9; var16 >= 5; --var16) {
               var7 = class241.method4140(var0);
               boolean var18 = 0 != (var7 >> var16 + 1 & 1);
               String var17;
               if (!var18 && null == var0.field3055) {
                  var17 = null;
               } else if (null != var0.field3038 && var0.field3038.length > var16 && var0.field3038[var16] != null && var0.field3038[var16].trim().length() != 0) {
                  var17 = var0.field3038[var16];
               } else {
                  var17 = null;
               }

               if (var17 != null) {
                  class8.method38(var17, var0.field3037, 1007, 1 + var16, var0.field3031, var0.id);
               }
            }

            var4 = class25.method413(var0);
            if (null != var4) {
               class8.method38(var4, var0.field3037, 25, 0, var0.field3031, var0.id);
            }

            for(var5 = 4; var5 >= 0; --var5) {
               var8 = class241.method4140(var0);
               boolean var21 = 0 != (var8 >> 1 + var5 & 1);
               String var19;
               if (!var21 && var0.field3055 == null) {
                  var19 = null;
               } else if (var0.field3038 != null && var0.field3038.length > var5 && null != var0.field3038[var5] && var0.field3038[var5].trim().length() != 0) {
                  var19 = var0.field3038[var5];
               } else {
                  var19 = null;
               }

               if (var19 != null) {
                  class25.method400(var19, var0.field3037, 57, var5 + 1, var0.field3031, var0.id, var0.field3104);
               }
            }

            var6 = class241.method4140(var0);
            boolean var20 = 0 != (var6 & 1);
            if (var20) {
               class8.method38(class270.field3232, "", 30, 0, var0.field3031, var0.id);
            }
         }
      }

   }

   static final void method300() {
      client.field604 = client.field593;
      class90.field1232 = true;
   }

   protected abstract void method163();

   protected abstract void method178();

   protected abstract void method179();

   protected abstract void method186();

   protected abstract void method190(boolean var1);

   public abstract void init();

   protected abstract void method275();
}
