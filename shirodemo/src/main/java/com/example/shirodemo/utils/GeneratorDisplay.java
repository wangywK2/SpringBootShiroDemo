package com.example.shirodemo.utils;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GeneratorDisplay {
	public static Logger logger = LoggerFactory.getLogger("GeneratorDisplay");
	public void generator() throws Exception{
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		//指定 逆向工程配置文件
		File configFile = new File("generatorConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
				callback, warnings);
		myBatisGenerator.generate(null);

	} 
	
	public static void main(String[] args) throws Exception {
		try {
			GeneratorDisplay generatorSqlmap = new GeneratorDisplay();
			generatorSqlmap.generator();
			logger.info("************************************");
			logger.info("**********反转工程成功 ！************");
			logger.info("************************************");
		} catch (Exception e) {
			logger.error("************************************");
			logger.error("**************反转工程失败 ！********");
			logger.error("************************************");
			logger.error(" 失败原因： {}",e.getMessage());
			e.printStackTrace();
		}
		
	}
}
