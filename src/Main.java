import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
        String names = "";
        String path = "test.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = xssfWorkbook.getSheetAt(0);
        //XSSFSheet sheet = xssfWorkbook.getSheet("Sheet1");
        int rows = sheet.getLastRowNum();
        int cells = sheet.getRow(1).getLastCellNum();
        for (int r = 2; r <= rows; r++) {
            XSSFRow row = sheet.getRow(r);
            ArrayList<String> radek = new ArrayList<>();
            for (int c = 3; c <= cells - 1; c++) {
                XSSFCell cell = row.getCell(c);
                String value = cell.getStringCellValue();
                if (!value.equals("")) {
                    radek.add(value);
                    //Trie insert?
                }
            }
            data.add(radek);
        }
        Trie strom = new Trie();
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.get(i).size(); j++) {
                Data cis=new Data(data.get(i).get(j),data.get(i).get(j).replaceAll("[^A-Za-z]+","").toLowerCase(),j,i);
                //Data.setOriginal = data.get(i).get(j);
                //Data.setWorking(wordy.replaceAll("[^A-Za-z]+","").toLowerCase());
                //Trie.insert(data);
                //System.out.println(cis);
                System.out.println(data.get(i).get(j));
                strom.insert(cis.getWorking());

            }
        }

        if (strom.search("keydistribution")) {
            System.out.println("yes");
        }




            System.out.println("First AD:");
                    String mystr="The Senior Information Security Services Analyst is the local security professional assigned to a Conduent Business Unit(s), Site or Strategic function / initiative. The Senior Information Security Services Analyst is responsible for ensuring good security risk management practices are adhered to within their assigned area. They will coordinate Conduent led projects within their functional area, perform compliance assessments and maintain a security risk scorecard that measures and improves maturity in their assigned area of responsibility. You will ensure that business propositions and initiatives are reviewed for security policy compliance and follow processes to reduce security risks. They will be commercially aware and compliance oriented. Job Responsibilities Performing security assessments & inspections of the environment to ensure compliance with security policy. Developing corrective action plans and lead projects to timely completion Conduct training and awareness sessions for all staff on the relevant security requirements / improvements within their assigned environment. Develop & implement the required processes, tools and guidance as required to reduce risk and to comply with security requirements. Act as the information security specialist / reviewer on business & IT projects, as well as coordinate relevant security assessments, as appropriate to the engagement/project. Responsible owner for all security & privacy projects affecting their assigned area (including assessments, analyses & remediation work streams) Drive cross functional risk remediation with the Local Stakeholders (IT, Site Leaders, Human Resources & Business Operations) Maintain responsibility for the risk dashboard and incident register for the site, including reporting of progress against KPIs General Work collaboratively with a diverse, global, and multicultural community Maintain confidentiality of work-related information and materials Establish and maintain effective working relationships Present information at various levels of the organization Stay up to date on security industry trends What We Expect From You Experience with cyber security or audit principles and practices required. Experience with industry best practices and standards for security and privacy (GDPR, PCI DSS, ISO 27001, or NIST) required. 3 to 5 years experience in a security or compliance role required. Strong oral and written communications skills required. Strong organizational and planning skills required. Experience working within a global environment, across multiple time zones preferred Knowledge of industry trends and emerging threats preferred. Certification in one or more areas of project management, information security, audit or cyber security (i.e., SSCP, CISA or CISSP) preferred.";
                    mystr=mystr.replaceAll("[^A-Za-z]+","").toLowerCase();
                    //int k = titles.size();
                    int k=rows; //POINT

//                    GFG.searchWords(data,k,mystr);

                    System.out.println("");
                    System.out.println("Second AD:");
                    mystr="About the job. As part of Security Team, the Security Analyst will assist with day-to-day operations related to vulnerability and threat risk management: identification, remediation, mitigation, and reporting. Responsibilities: Research and investigate new and emerging threats and vulnerabilities, Analyze results of vulnerability assessments, Act as a domain specialist in external/vendor vulnerabilities detection and impact assessment, accelerate and improve it, Contribute to the aggregation and reporting of vulnerability metrics and information, provide regular updates for reported vulnerabilities, Partner with multi-functional teams to ensure remediation of identified vulnerabilities occurs within noted timeframes and in adherence with information security policies, Partner with stakeholders to streamline, standardize and document vulnerability management procedures, Feel comfortable voicing their own opinion while negotiating with key stakeholders or explaining relevance of a particular finding, Assist in supporting, mentoring, and development of analysts/engineers, Be flexible working with overseas teams during off-hours. Qualifications: Bachelors Degree in Computer Engineering, Computer Science, or a related field, 2+ years of experience in information security, cyber risk management or security advisory, Practical experience with identifying, analyzing, and communicating cyber threat and vulnerability information, Knowledge on OWASP vulnerabilities and methodology, Experience with tools like Qualys, Splunk, Elasticsearch, Jira, Confluence, Programming or scripting experience is a plus Thorough understanding of project/program management techniques and methods, Excellent written and verbal communication skills, Highly self-motivated and directed, Recognized industry certification and/or continuing education programs are a major plus including CISSP, CEH, Security+";
                    mystr=mystr.replaceAll("[^A-Za-z]+","").toLowerCase();
//                    GFG.searchWords(data,k,mystr);

                    System.out.println("");
                    System.out.println("Third AD:");
                    mystr="About the job: Define and support implementation of IT security processes within the IT organization according to given priorities by IT management, Coordinate and manage security policy, perform check and assessment activities, Identify and evaluate security risks, prepare mitigation actions, Be the IT internal consultant on data privacy topics (e.g. GDPR), Support/drive projects in the field of IT security in interdisciplinary teams or with external partners, Develop and be responsible for IT continuity and disaster recovery plans. Your Profile: University degree in IT/information systems or other technical discipline, Minimum of 5 years of experience in a similar role or as an IT Security Engineer, Very good communication skills in English, Good knowledge of the data privacy regulations and willingness to expand the knowledge, Deep experience in IT security thread-modelling/IT continuity and disaster recovery/risk management, Solid experience in applications-, endpoint-, network- and system engineering, IT project management, Data privacy (GDPR)";
                    mystr=mystr.replaceAll("[^A-Za-z]+","").toLowerCase();
//                    GFG.searchWords(data,k,mystr);

                    //System.out.println(arr);
                    }
                    }
