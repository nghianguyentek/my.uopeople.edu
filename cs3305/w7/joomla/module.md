# Joomla Modules

## Characteristics

- An UI [extension](extension.md)
- Collaboration over competition
- Preferred GPL (GNU General Public License) license
- Must be placed in a template placeholder at a particular position

## Basic components

- `%module-name%.php`: the main entry point ([sample](#mod_my_db_modulephp-file))
  - Initialize routines
  - Include and call `helper.php` functions to prepare data
  - Include templates
- `%module-name%.xml`: module configuration ([sample](#mod_my_db_modulexml-file))
  - `name`
  - `version`
  - `files`
  - `config`
  - `install`
  - `uninstall`
  - `update`
- `helper.php`: retrieve data ([sample](#helperphp-file))
- `tmpl/default.php`: default template file ([sample](#tmpldefaultphp-file))

### Samples

#### A basic module

##### `mod_my_db_module.php` file

```php
<?php 
defined('_JEXEC') or die;
require_once dirname(__FILE__) . '/helper.php';
$msg = ModMyDbModuleHelper::getMessage($params->get('lang', 1));
require JModuleHelper::getLayoutPath('mod_my_db_module');
?>
```

##### `mod_my_db_module.xml` file

```xml
<?xml version="1.0" encoding="utf-8"?>
<extension type="module" version="3.1.0" client="site" method="upgrade">
  <name>My db module</name>
  <version>1.0.0</version>
  <author>Nghia Nguyen</author>
  <description>My sample module having database accessing</description>
  <files>
    <filename>mod_my_db_module.xml</filename>
    <filename module="mod_my_db_module">mod_my_db_module.php</filename>
    <filename>helper.php</filename>
    <filename>tmpl/default.php</filename>
    <folder>sql</folder>
  </files>
  <install>
    <sql>
      <file driver="mysql" charset="utf8">sql/install.sql</file>
    </sql>
  </install>
  <uninstall>
    <sql>
      <file driver="mysql" charset="utf8">sql/uninstall.sql</file>
    </sql>
  </uninstall>
  <update>
    <schemas>
      <schemapath type="mysql">sql/updates</schemapath>
    </schemas>
  </update>
  <config>
    <fields name="params">
      <fieldset name="basic">
        <field name="lang" type="sql" default="1" label="Select a language" query="SELECT id AS value, lang FROM `#__sampleTable`"/>
      </fieldset>
    </fields>
  </config>
</extension>
```

##### `helper.php` file

```php
<?php
class ModMyDbModuleHelper {
  public static function getMessage($langId) {
    $db = JFactory::getDbo();
    $query = $db->getQuery(true)->select($db->quoteName('hello'))->from($db->quoteName('#__sampleTable'))->where('id=' . $db->Quote($langId));
    $db->setQuery($query);
    $result = $db->loadResult();
    return $result;
  }
}
?>
```

##### `tmpl/default.php` file

```php
<?php
defined('_JEXEC') or die;
echo "Say hello in French: $msg";
?>
```

##### `sql/install.sql` file

```sql
CREATE TABLE `#__sampleTable` (
	`id` int(10) NOT NULL AUTO_INCREMENT,
	`hello` text NOT NULL,
	`lang` varchar(25) NOT NULL,

  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;

INSERT INTO `#__sampleTable` (`hello`, `lang`) VALUES ('Hello World', 'en-GB');
INSERT INTO `#__sampleTable` (`hello`, `lang`) VALUES ('Hola Mundo', 'es-ES');
INSERT INTO `#__sampleTable` (`hello`, `lang`) VALUES ('Bonjour tout le monde', 'fr-FR');
```

##### `sql/uninstall.sql` file

```sql
DROP TABLE IF EXISTS `#__sampleTable`
```

##### `update/1.0.0.sql` file

```sql
# Nothing to update 
```

## Common modules

- Menu
- Title
- Footer
- Breadcrumb
- Logged-in users
- Latest users
- Who's online
- Security
  - Backup
    - Akeeba backup
- Events
  - JEvents
- SEF - Search Engine Friendly
  - JoomSEF
- Search
- Smart search
- Language switcher
- Random images
- Custom
- Forms
  - Breezing forms
  - ChronoForms
  - RSForm! Pro (Paid download)
- Aixeena slide
- Marketing
  - AcyMailing Starter
  - jNews
- Content
  - Management
    - K2
    - Easy blog (Paid download)
  - Display
    - Latest news
    - FRC - Fewest Read Content
  - Tags
    - Popular tags
    - Similar tags
  - Donation
    - OSDonate
- Free Display

### Notes

- `#__`: database name alias