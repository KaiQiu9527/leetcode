package leetcode_811;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 一个网站域名，如"discuss.leetcode.com"，包含了多个子域名。作为顶级域名，常用的有"com"，下一级则有"leetcode.com"，最低的一级为"discuss.leetcode.com"。当我们访问域名"discuss.leetcode.com"时，也同时访问了其父域名"leetcode.com"以及顶级域名 "com"。
 *
 * 给定一个带访问次数和域名的组合，要求分别计算每个域名被访问的次数。其格式为访问次数+空格+地址，例如："9001 discuss.leetcode.com"。
 *
 * 接下来会给出一组访问次数和域名组合的列表cpdomains 。要求解析出所有域名的访问次数，输出格式和输入格式相同，不限定先后顺序。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/subdomain-visit-count
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String,Integer> domainMap = new HashMap<>();
        List<String> returnList = new LinkedList<>();
        for (String cpdomain : cpdomains){
            String[] contents = cpdomain.split(" ");
            domainMap.put(contents[1],Integer.valueOf(contents[0]) + (domainMap.containsKey(contents[1])?domainMap.get(contents[1]):0));
            String tempString = contents[1];
            while (tempString.contains(".")){
                tempString = tempString.substring(tempString.indexOf(".")+1);
                domainMap.put(tempString,Integer.valueOf(contents[0]) + (domainMap.containsKey(tempString)?domainMap.get(tempString):0));
            }
        }
        for (String s : domainMap.keySet()){
            StringBuilder sb = new StringBuilder();
            sb.append(domainMap.get(s));
            sb.append(" ");
            sb.append(s);
            returnList.add(sb.toString());
        }

        return returnList;
    }

    public static void main(String[] args) {
        String[] testString = new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        System.out.println(new Solution().subdomainVisits(testString));
    }
}
