package wrappers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObjectRepository {

        //Sign In page
        @FindBy(xpath = "/html/body/div/div/div/div[4]/div/div/a")
        public  static WebElement Sign_In;

        @FindBy(id = "username")
        public static WebElement lgn_Username;


        @FindBy(id = "password")
        public static WebElement lgn_Password;

        @FindBy(id = "t1li")
        public static WebElement lgn_SignInButton;

        //WS Creation

        @FindBy(xpath = "//*[@id=\"sidebar-organization\"]/div[2]/div[2]/img")
        public static WebElement WS_Clickonicon;

        @FindBy(id = "workspaceNameInput")
        public static WebElement WS_workspaceNameInput;

        @FindBy(xpath = "//*[@id=\"create-project-view\"]/div[2]/div[4]/div[3]/div/textarea")
        public static WebElement WS_workspaceDescInput;

        @FindBy(id = "createWorkspaceButton")
        public static WebElement WS_createWorkspaceButton;

        //Add Members while creating WS

        @FindBy(css = "div.add-members-text")
        public static WebElement wsMem_AddMembersPlus;

        @FindBy(css = "input.add-members-input")
        public static WebElement wsMem_AddMembersinput;

        @FindBy(xpath = "//*[@id=\"members\"]/div[1]/div/div/div[5]/div[2]/button")
        public static WebElement wsMem_InviteasGuest;

        @FindBy(className = "ic_close_buttonx")
        public static WebElement Add_mem_close_Button;

        @FindBy(css = "button.to-btn.to-btn-green.to-modal-trap-last")
        public static WebElement wsMem_Done_Button;

        @FindBy(className = "workspace-container")
        public static WebElement WS_Container;

        @FindBy(xpath = "//*[@id=\"members\"]/div[1]/div/div/div[4]/div[1]")
        public static WebElement WS_exist_user;


        //Task Creation

        @FindBy(xpath = "//*[@aria-label='Attachments']")
        public static WebElement task_wsPlus_button;

        @FindBy(css = ".ws-tab-button-tasks")
        public static WebElement task_button;

        @FindBy(xpath="//img[@src='/images/add-new/ic_addnew_task.svg']")
        public static WebElement Add_new_task;

        //Task Modal

        @FindBy(id="title")
        public static WebElement task_Add_title;

        @FindBy(css=".cke_editable")
        public static WebElement task_AddDesc;

        @FindBy(className = "to-btn to-btn-blue to-btn-med nh2-publish-btn")
        public static WebElement Publish;

        @FindBy(css="iframe[title*='Rich Text Editor, editor1']")
        public static WebElement ws_task_iFrame;

        @FindBy(css="[class*='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
        public static WebElement ws_task_desc;

        @FindBy(css="button[title='Publish']")
        public static WebElement ws_task_publish;

        @FindBy(css="button[class*='nev2-tag-plus noselect']")
        public static WebElement ws_tagPluss_icon;

        @FindBy(id="tag-select-input")
        public static WebElement ws_in_tagModal;

        @FindBy(css="[class*='to-btn to-btn-med to-btn-blue btn-add']")
        public static WebElement ws_tagModal_add_button;

        @FindBy(css="[class*='chatbox-textarea mousetrap']")
        public static WebElement ws_task_cac_input;

        @FindBy(css="button[title='Follow']")
        public static WebElement ws_task_follow;

        @FindBy(css="button[title='Go to Workspace']")
        public  static WebElement ws_task_goto_WS;

        @FindBy(xpath = "//*[@aria-label='Back to List']")
        public static WebElement ws_task_Back_to_List;

        @FindBy(xpath = "//*[@id=\"create-note-modal\"]/div/div/div[2]/div[1]/div/div/div[1]/span[4]/a/i")
        public static WebElement ws_task_close;

        @FindBy(className="pull-right")
        public static WebElement ws_close_iFrame;

        @FindBy(xpath = "//*[@id=\"create-note-modal\"]/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/label/input")
        public static WebElement task_complete;

        @FindBy(xpath = "//*[@id=\"create-note-modal\"]/div/div/div[2]/div[2]/div/div[1]/div/div/div[2]/button[1]")
        public static WebElement task_assign;

        @FindBy(id = "assignee-list")
        public static WebElement Assign_list;

        @FindBy(xpath = "//*[@id=\"create-note-modal\"]/div/div/div[2]/div[1]/div/div/div[1]/span[1]/span/button")
        public static WebElement Share;

        @FindBy(xpath = "//*[@id=\"create-note-modal\"]/div/div/div[2]/div[1]/div/div/div[1]/span[1]/span/ul/li[1]/a")
        public static WebElement Share_Mem;

        @FindBy(xpath = "/html/body/div[12]/div[2]/div[2]/div/div/div")
        public static WebElement Mem_select;

        @FindBy(id = "autocomplete-user-name")
        public static WebElement Mem_input;

        @FindBy(xpath = "/html/body/div[12]/div[3]/button")
        public static WebElement submit;

        @FindBy(xpath = "//*[@id=\"create-note-modal\"]/div/div/div[2]/div[1]/div/div/div[1]/span[1]/span/ul/li[2]/a")
        public static WebElement Share_Email;

        @FindBy(id="autocomplete-user-email")
        public static WebElement Email_input;

        @FindBy(xpath = "/html/body/div[11]/div[2]/div/div/div[3]/button")
        public static WebElement Email_Submit;

        @FindBy(xpath = "//*[@id=\"create-note-modal\"]/div/div/div[2]/div[1]/div/div/div[1]/span[1]/span/ul/li[3]/a")
        public static WebElement Share_Get_Link;

        @FindBy(className = "to-btn to-btn-blue copy-link to-modal-trap-last")
        public static WebElement Copy;


        //WS Activity Log

        @FindBy(xpath="//*[@id=\"activities-and-create-note\"]/div[4]/div/textarea")
        public static WebElement Comment_Pane;

        @FindBy(xpath = "//*[@id=\"activities-and-create-note\"]/div[4]/div/div[1]")
        public static WebElement Giffy;

        @FindBy(xpath="//*[@id=\"workspace-activities-container\"]/div[7]/div/div[2]/div[1]/input")
        public static WebElement Giffy_search_Area;

        @FindBy(xpath="//*[@id=\"workspace-activities-container\"]/div[7]/div/div[2]/div[1]/button")
        public static WebElement search_box;

        @FindBy(xpath="//*[@id=\"workspace-activities-container\"]/div[7]/div/div[2]/div[2]/button[1]")
        public static WebElement prev_button;

        @FindBy(xpath="//*[@id=\"workspace-activities-container\"]/div[7]/div/div[2]/div[2]/button[2]")
        public static WebElement next_button;

        @FindBy(xpath="//*[@id=\"workspace-activities-container\"]/div[7]/div/div[2]/div[2]/button[3]")
        public static WebElement Giffy_Close;

        @FindBy(xpath="//*[@id=\"workspace-activities-container\"]/div[7]/div/div[3]/div[1]")
        public static WebElement Giffy_img;

        @FindBy(xpath="//*[@id=\"activities-and-create-note\"]/div[4]/div/div[2]/span")
        public static WebElement Emoji;



















        // People tab elements
        @FindBy (className = "sidebar-button-members")
        public static WebElement sb_people;

        @FindBy(xpath = "//*[@aria-label='Add Dropdown']")
        public static WebElement ppl_add;

        @FindBy(xpath = "//*[@aria-label='Add Contact']")
        public static WebElement ppl_addContact;

        @FindBy(xpath = "//*[@aria-label='Add Group']")
        public static WebElement ppl_addGroup;

        @FindBy(id = "group-edit-input")
        public static WebElement grp_input_name;

        @FindBy(css = "button[class='to-btn to-btn-blue btn-create to-modal-trap-last']")
        public static WebElement grp_create_button;

        @FindBy(css=".to-header-close[aria-label='Close']")
        public static WebElement grp_close_button;
        //Toast message class name
        @FindBy(className = "noty_body")
        public static WebElement toast;

        @FindBy(className = "display-name-input")
        public static WebElement ppl_contact_input_displayName;

        @FindBy(className = "prefix-input ")
        public static WebElement ppl_contact_input_prefix;

        @FindBy(className = "first-name-input")
        public static WebElement ppl_contact_input_firstName;

        @FindBy(className = "middle-name-input")
        public static WebElement ppl_contact_input_middleName;

        @FindBy(className = "last-name-input")
        public static WebElement ppl_contact_input_lastName;

        @FindBy(className = "suffix-input")
        public static WebElement ppl_contact_input_suffix;

        @FindBy(className = "title-input")
        public static WebElement ppl_contact_input_jobTitle;

        @FindBy(css="[id*='contact-phone-number']")
        public static WebElement ppl_contact_input_workPhone;

        @FindBy(className ="email-input")
        public static WebElement ppl_contact_input_email;

        @FindBy(css = "[id*='contact-address-street']")
        public static WebElement ppl_contact_input_street;

        @FindBy(css = "[id*='contact-address-city']")
        public static WebElement ppl_contact_input_city;

        @FindBy(css="[id*='contact-address-state']")
        public static WebElement ppl_contact_input_state;

        @FindBy(css = "[id*='contact-address-zip']")
        public static WebElement ppl_contact_input_postalcode;

        @FindBy(css="[id*='contact-address-country']")
        public static WebElement ppl_contact_input_country;

        @FindBy(css = "[id*='contact-im-type']")
        public static WebElement ppl_contact_input_imType;

        @FindBy(css="[id*='contact-im-username']")
        public static WebElement ppl_contact_input_im_userName;

        @FindBy(css = "button[class='to-btn to-btn-blue btn-save to-modal-trap-last']")
        public static WebElement ppl_contact_create_button;

        // Note creation

        @FindBy(css ="[class = 'sidebar-button-feed']")
        public static WebElement sb_feed;

        @FindBy(css = "[class='chatbox-attachment-menu no-select cb-bg-primary ']")
        public static WebElement ws_add_icon;

        @FindBy(css = "[class='chatbox-textarea mousetrap]")
        public static WebElement ws_chat_input;

        @FindBy(css = "[class='attachment-menu-icon']")
        public static WebElement ws_note_icon;

        //Note Modal
        @FindBy(id = "title")
        public static WebElement ws_note_title;

        @FindBy(css="iframe[title*='Rich Text Editor, editor1']")
        public static WebElement ws_note_iFrame;

        @FindBy(css="[class*='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")
        public static WebElement ws_note_desc;

        @FindBy(css="button[title='Publish']")
        public static WebElement ws_note_publish;

        @FindBy(css="button[title='Follow']")
        public static WebElement ws_note_follow;

        @FindBy(css="[class*='btn dropdown-toggle note-hdr-dropdwn-btn']")
        public static WebElement ws_note_more;

        @FindBy(css = "[action='delete']")
        public static WebElement ws_note_delete;

        @FindBy(css="button[class*='nev2-tag-plus noselect']")
        public static WebElement ws_tagPlus_icon;

        @FindBy(id="tag-select-input")
        public static WebElement ws_input_tagModal;

        @FindBy(css="[class*='to-btn to-btn-med to-btn-blue btn-add']")
        public static WebElement ws_tagModal_add_buuton;

        @FindBy(css="[class*='chatbox-textarea mousetrap']")
        public static WebElement ws_note_cac_input;



    }


