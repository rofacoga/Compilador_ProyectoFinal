/* Generated By:JJTree&JavaCC: Do not edit this line. CompiladorTokenManager.java */
package controlador;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/** Token Manager. */
public class CompiladorTokenManager implements CompiladorConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x30000000L) != 0L)
            return 14;
         if ((active0 & 0x8fffff80L) != 0L)
         {
            jjmatchedKind = 43;
            return 16;
         }
         return -1;
      case 1:
         if ((active0 & 0x4000L) != 0L)
            return 16;
         if ((active0 & 0x8fffbf80L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 1;
            return 16;
         }
         return -1;
      case 2:
         if ((active0 & 0x8fffbf80L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 2;
            return 16;
         }
         return -1;
      case 3:
         if ((active0 & 0x8fffbf80L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 3;
            return 16;
         }
         return -1;
      case 4:
         if ((active0 & 0x86a72000L) != 0L)
            return 16;
         if ((active0 & 0x9589f80L) != 0L)
         {
            if (jjmatchedPos != 4)
            {
               jjmatchedKind = 43;
               jjmatchedPos = 4;
            }
            return 16;
         }
         return -1;
      case 5:
         if ((active0 & 0x88180L) != 0L)
            return 16;
         if ((active0 & 0xf501e00L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 5;
            return 16;
         }
         return -1;
      case 6:
         if ((active0 & 0x400000L) != 0L)
            return 16;
         if ((active0 & 0xf101e00L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 6;
            return 16;
         }
         return -1;
      case 7:
         if ((active0 & 0x1001000L) != 0L)
            return 16;
         if ((active0 & 0xe100e00L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 7;
            return 16;
         }
         return -1;
      case 8:
         if ((active0 & 0x100000L) != 0L)
            return 16;
         if ((active0 & 0xe000e00L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 8;
            return 16;
         }
         return -1;
      case 9:
         if ((active0 & 0xe00L) != 0L)
            return 16;
         if ((active0 & 0xe000000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 9;
            return 16;
         }
         return -1;
      case 10:
         if ((active0 & 0xe000000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 10;
            return 16;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 41);
      case 41:
         return jjStopAtPos(0, 42);
      case 43:
         return jjStopAtPos(0, 38);
      case 45:
         return jjMoveStringLiteralDfa1_0(0x30000000L);
      case 46:
         return jjStopAtPos(0, 39);
      case 58:
         return jjStopAtPos(0, 40);
      case 59:
         return jjStopAtPos(0, 45);
      case 66:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 67:
         return jjMoveStringLiteralDfa1_0(0xa00L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x400L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x1020000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x90000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x88000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x300000L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x6800000L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 70:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000L);
      case 73:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x7900880L);
      case 100:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(1, 14, 16);
         break;
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x8201000L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x80072600L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x480000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 73:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000L);
      case 78:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x480000L);
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x80L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x8e821000L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x100800L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x1010200L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x40400L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0xa100L);
      case 120:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 70:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 73:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000L);
      case 78:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000L);
      case 100:
         return jjMoveStringLiteralDfa4_0(active0, 0x50000L);
      case 101:
         return jjMoveStringLiteralDfa4_0(active0, 0x8001000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x80008080L);
      case 109:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x6822000L);
      case 112:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x1200200L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 45:
         if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(4, 29);
         break;
      case 67:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000000L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x8001000L);
      case 100:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(4, 31, 16);
         break;
      case 101:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(4, 18, 16);
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000L);
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x8100L);
      case 110:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(4, 13, 16);
         return jjMoveStringLiteralDfa5_0(active0, 0x80L);
      case 111:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(4, 16, 16);
         else if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(4, 21, 16);
         return jjMoveStringLiteralDfa5_0(active0, 0x800L);
      case 114:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(4, 17, 16);
         else if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 23;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x6000000L);
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x480000L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x100400L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000000L);
      case 73:
         return jjMoveStringLiteralDfa6_0(active0, 0x12000000L);
      case 84:
         return jjMoveStringLiteralDfa6_0(active0, 0x800L);
      case 97:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(5, 7, 16);
         break;
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000L);
      case 101:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(5, 19, 16);
         return jjMoveStringLiteralDfa6_0(active0, 0x100000L);
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x400L);
      case 110:
         return jjMoveStringLiteralDfa6_0(active0, 0x200L);
      case 111:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(5, 8, 16);
         else if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(5, 15, 16);
         break;
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x400000L);
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 79:
         return jjMoveStringLiteralDfa7_0(active0, 0x10000000L);
      case 97:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(6, 22, 16);
         return jjMoveStringLiteralDfa7_0(active0, 0x1000400L);
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0xa00L);
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000000L);
      case 110:
         return jjMoveStringLiteralDfa7_0(active0, 0x2100000L);
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000L);
      case 120:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 45:
         if ((active0 & 0x10000000L) != 0L)
            return jjStopAtPos(7, 28);
         break;
      case 100:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(7, 24, 16);
         return jjMoveStringLiteralDfa8_0(active0, 0x200L);
      case 111:
         return jjMoveStringLiteralDfa8_0(active0, 0x8000000L);
      case 114:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(7, 12, 16);
         return jjMoveStringLiteralDfa8_0(active0, 0x400L);
      case 116:
         return jjMoveStringLiteralDfa8_0(active0, 0x6100000L);
      case 120:
         return jjMoveStringLiteralDfa8_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(8, 20, 16);
         return jjMoveStringLiteralDfa9_0(active0, 0x6000000L);
      case 105:
         return jjMoveStringLiteralDfa9_0(active0, 0x400L);
      case 110:
         return jjMoveStringLiteralDfa9_0(active0, 0x8000000L);
      case 111:
         return jjMoveStringLiteralDfa9_0(active0, 0x200L);
      case 116:
         return jjMoveStringLiteralDfa9_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa10_0(active0, 0x8000000L);
      case 111:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(9, 10, 16);
         else if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(9, 11, 16);
         break;
      case 114:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(9, 9, 16);
         return jjMoveStringLiteralDfa10_0(active0, 0x6000000L);
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0);
      return 10;
   }
   switch(curChar)
   {
      case 100:
         return jjMoveStringLiteralDfa11_0(active0, 0x8000000L);
      case 110:
         return jjMoveStringLiteralDfa11_0(active0, 0x6000000L);
      default :
         break;
   }
   return jjStartNfa_0(9, active0);
}
static private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0);
      return 11;
   }
   switch(curChar)
   {
      case 111:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(11, 25, 16);
         else if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(11, 26, 16);
         else if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(11, 27, 16);
         break;
      default :
         break;
   }
   return jjStartNfa_0(10, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 25;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 34)
                        kind = 34;
                     jjCheckNAddStates(0, 2);
                  }
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(18, 19);
                  else if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 14;
                  else if (curChar == 35)
                     jjstateSet[jjnewStateCnt++] = 4;
                  else if (curChar == 60)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 1:
                  if ((0xbfffffffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 2:
                  if (curChar == 62 && kind > 2)
                     kind = 2;
                  break;
               case 3:
                  if (curChar == 35)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) != 0L && kind > 32)
                     kind = 32;
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 13:
                  if (curChar == 45)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 14:
                  if (curChar == 62 && kind > 37)
                     kind = 37;
                  break;
               case 16:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 17:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(18, 19);
                  break;
               case 18:
                  if ((0xfffffffbffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(18, 19);
                  break;
               case 19:
                  if (curChar == 34 && kind > 44)
                     kind = 44;
                  break;
               case 20:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 34)
                     kind = 34;
                  jjCheckNAddStates(0, 2);
                  break;
               case 21:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(21, 23);
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 34)
                     kind = 34;
                  jjCheckNAdd(24);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 43)
                        kind = 43;
                     jjCheckNAdd(16);
                  }
                  else if (curChar == 95)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 1:
                  jjAddStates(3, 4);
                  break;
               case 4:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 5:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 6:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 7:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 8:
                  if ((0x7e0000007eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 9:
                  if ((0x7e0000007eL & l) != 0L && kind > 32)
                     kind = 32;
                  break;
               case 10:
                  if (curChar == 95)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 11:
                  if ((0x7fffffe00000000L & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAdd(12);
                  break;
               case 12:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAdd(12);
                  break;
               case 15:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  jjCheckNAdd(16);
                  break;
               case 16:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  jjCheckNAdd(16);
                  break;
               case 18:
                  jjAddStates(5, 6);
                  break;
               case 22:
                  if (curChar == 120 && kind > 30)
                     kind = 30;
                  break;
               case 23:
                  if (curChar == 112)
                     jjstateSet[jjnewStateCnt++] = 22;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(3, 4);
                  break;
               case 18:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(5, 6);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 25 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   21, 23, 24, 1, 2, 18, 19, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, "\120\141\147\151\156\141", 
"\124\151\164\165\154\157", "\103\157\156\164\145\156\145\144\157\162", 
"\106\157\162\155\165\154\141\162\151\157", "\103\141\155\160\157\124\145\170\164\157", 
"\123\145\154\145\143\164\157\162", "\102\157\164\157\156", "\151\144", "\145\163\164\151\154\157", 
"\146\157\156\144\157", "\143\157\154\157\162", "\142\157\162\144\145", "\146\165\145\156\164\145", 
"\164\141\155\106\165\145\156\164\145", "\164\145\170\164\157", "\155\165\145\163\164\162\141", 
"\166\141\154\157\162", "\143\141\156\164\151\144\141\144", 
"\166\141\154\157\162\111\156\164\145\162\156\157", "\166\141\154\157\162\105\170\164\145\162\156\157", 
"\163\145\154\145\143\143\151\157\156\141\144\157", "\55\111\116\111\103\111\117\55", "\55\106\111\116\55", null, 
"\163\157\154\151\144", null, null, null, null, null, null, "\53", "\56", "\72", "\50", "\51", null, 
null, "\73", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x3ff5ffffff81L, 
};
static final long[] jjtoSkip = {
   0x7eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[25];
static private final int[] jjstateSet = new int[50];
static protected char curChar;
/** Constructor. */
public CompiladorTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public CompiladorTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 25; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
