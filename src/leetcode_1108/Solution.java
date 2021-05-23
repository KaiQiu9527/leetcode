package leetcode_1108;

import java.util.ArrayList;
import java.util.Arrays;
//给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
//所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。

//可用StringBuilder或者直接replace

public class Solution {
    public String defangIPaddr(String address) {
        StringBuffer sb = new StringBuffer();
        for (char i : address.toCharArray()){
            if (i == '.')
            {
                sb.append('[');
                sb.append(i);
                sb.append(']');
            }
            else
                sb.append(i);
        }
        System.out.println(sb.toString());
        return String.valueOf(sb.toString());
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        s.defangIPaddr("192.168.0.0");
    }
}
