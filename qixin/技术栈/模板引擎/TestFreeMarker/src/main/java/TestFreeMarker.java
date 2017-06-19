import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by qixin on 2017/6/19.
 */
public class TestFreeMarker {
    private Configuration cfg;
    private String key="key";

    public void init() throws Exception {
        cfg = new Configuration();
        StringTemplateLoader stringTemplateLoader = new StringTemplateLoader();
        stringTemplateLoader.putTemplate(key, "${name}，你好！${msg}");
        cfg.setTemplateLoader(stringTemplateLoader);
    }

    public void process() throws Exception {
        Map<String,Object> root = new HashMap<String,Object>();
        root.put("name", "FreeMarker!");
        root.put("msg", "您已经完成了第一个FreeMarker的示例");
        Template t = cfg.getTemplate(key);
        t.process(root, new OutputStreamWriter(System.out));
    }

    public static void main(String[] args) throws Exception {
        TestFreeMarker hf = new TestFreeMarker();
        hf.init();
        hf.process();
    }
}
